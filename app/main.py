from fastapi import FastAPI, HTTPException, Depends, Request
from fastapi.security import OAuth2PasswordBearer
from fastapi.middleware.cors import CORSMiddleware
from pydantic import BaseModel, Field
from transformers import pipeline
from prometheus_fastapi_instrumentator import Instrumentator
from fastapi.openapi.utils import get_openapi
from langdetect import detect
from deep_translator import GoogleTranslator
from slowapi import Limiter, _rate_limit_exceeded_handler
from slowapi.util import get_remote_address
from slowapi.errors import RateLimitExceeded
import boto3
import json
import uvicorn
import logging

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger("healthcare_ai")

s3_client = boto3.client("s3")
S3_BUCKET_NAME = "healthcare-ai-audit-logs"

class SymptomRequest(BaseModel):
    symptoms: str = Field(..., min_length=5, max_length=500, pattern="^[\w\s,.!?'-]+$")

class DiagnosisResponse(BaseModel):
    diagnosis: str

app = FastAPI(title="Healthcare AI Symptom Checker", version="1.7")

Instrumentator().instrument(app).expose(app)

app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

limiter = Limiter(key_func=get_remote_address, default_limits=["5/minute"])
app.state.limiter = limiter
app.add_exception_handler(RateLimitExceeded, _rate_limit_exceeded_handler)

oauth2_scheme = OAuth2PasswordBearer(tokenUrl="token")

symptom_checker = pipeline("text-classification", model="distilbert-base-uncased-finetuned-sst-2-english")

def verify_token(token: str = Depends(oauth2_scheme)):
    if token != "securetoken123":
        raise HTTPException(status_code=401, detail="Unauthorized")

def map_to_snomed(symptoms: str, label: str) -> str:
    return "123456" if label == 'ENTAILMENT' else "654321"

def audit_log(user_ip: str, symptoms: str, diagnosis: str):
    log_data = json.dumps({"ip": user_ip, "symptoms": symptoms, "diagnosis": diagnosis})
    s3_client.put_object(Bucket=S3_BUCKET_NAME, Key=f"logs/{user_ip}-{diagnosis[:10]}.json", Body=log_data.encode("utf-8"))

@app.get("/health")
async def health_check():
    return {"status": "ok"}

@app.post("/diagnose", response_model=DiagnosisResponse)
@limiter.limit("5/minute")
async def diagnose_symptoms(request: Request, body: SymptomRequest, token: str = Depends(verify_token)):
    language = detect(body.symptoms)
    input_text = GoogleTranslator(source=language, target="en").translate(body.symptoms) if language != "en" else body.symptoms
    results = symptom_checker(input_text)
    snomed_code = map_to_snomed(body.symptoms, results[0]['label'])

    diagnosis = (
        f"Symptoms align with known mild conditions (SNOMED: {snomed_code}). Monitor and consult a physician."
        if results[0]['label'] == 'ENTAILMENT'
        else f"Symptoms may not match mild conditions (SNOMED: {snomed_code}). Please consult a healthcare professional immediately."
    )

    audit_log(request.client.host, body.symptoms, diagnosis)
    return DiagnosisResponse(diagnosis=diagnosis)

@app.get("/docs-json", include_in_schema=False)
def custom_openapi():
    return get_openapi(title="Healthcare AI Symptom Checker API", version="1.7", description="AI healthcare API", routes=app.routes)

if __name__ == "__main__":
    uvicorn.run("app.main:app", host="0.0.0.0", port=8000)
