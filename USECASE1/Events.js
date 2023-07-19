
document.getElementById("it-link").addEventListener("click", function(event) {
  event.preventDefault(); // Prevent the default link behavior
  fetchJobListings("information-technology");
});

document.getElementById("finance-link").addEventListener("click", function(event) {
  event.preventDefault();
  fetchJobListings("finance");
});

document.getElementById("marketing-link").addEventListener("click", function(event) {
  event.preventDefault();
  fetchJobListings("marketing");
});

document.getElementById("Engineering-link").addEventListener("click", function(event) {
  event.preventDefault();
  fetchJobListings("engineering");
});

document.getElementById("sales-link").addEventListener("click", function(event) {
  event.preventDefault();
  fetchJobListings("sales");
});

document.getElementById("hr-link").addEventListener("click", function(event) {
  event.preventDefault();
  fetchJobListings("human-resources");
});

document.getElementById("customerService-link").addEventListener("click", function(event) {
  event.preventDefault();
  fetchJobListings("customer-service");
});

document.getElementById("Healthcare-link").addEventListener("click", function(event) {
  event.preventDefault();
  fetchJobListings("healthcare");
});

document.getElementById("Education-link").addEventListener("click", function(event) {
  event.preventDefault();
  fetchJobListings("education");
});

document.getElementById("Hospitality-link").addEventListener("click", function(event) {
  event.preventDefault();
  fetchJobListings("hospitality");
});


function fetchJobListings(category) {
  const jobContainer = document.getElementById("job-container");
  jobContainer.innerHTML = ""; 

  let jobListings = [];

  if (category === "information-technology") {
    jobListings = [
      { title: "IT Job 1", company: "Company 1" },
      { title: "IT Job 2", company: "Company 2" },
      // Add more IT job listings here
    ];
  } else if (category === "finance") {
    jobListings = [
      { title: "Finance Job 1", company: "Company 1" },
      { title: "Finance Job 2", company: "Company 2" },
      // Add more finance job listings here
    ];
  } else if (category === "marketing") {
    jobListings = [
      { title: "Marketing Job 1", company: "Company 1" },
      { title: "Marketing Job 2", company: "Company 2" },
      // Add more marketing job listings here
    ];
  }
else if (category === "Engineering") {
    jobListings = [
      { title: "Engineering Job 1", company: "Company 1" },
      { title: "Engineering Job 2", company: "Company 2" },
      // Add more marketing job listings here
    ];
  }
else if (category === "sales") {
    jobListings = [
      { title: "Sales Job 1", company: "Company 1" },
      { title: "Sales Job 2", company: "Company 2" },
      // Add more sales job listings here
    ];
  }
else if (category === "Human Resources") {
    jobListings = [
      { title: "Human Resources Job 1", company: "Company 1" },
      { title: "Human Resources Job 2", company: "Company 2" },
      // Add more Human Resources job listings here
    ];
  }
else if (category === "Customer Service") {
    jobListings = [
      { title: "Customer Service Job 1", company: "Company 1" },
      { title: "Customer Service Job 2", company: "Company 2" },
      // Add more Customer Service job listings here
    ];
  }
else if (category === "Healthcare") {
    jobListings = [
      { title: "Healthcare Job 1", company: "Company 1" },
      { title: "Healthcare Job 2", company: "Company 2" },
      // Add more Healthcare job listings here
    ];
  }
else if (category === "Education") {
    jobListings = [
      { title: "Education Job 1", company: "Company 1" },
      { title: "Education Job 2", company: "Company 2" },
      // Add more Education job listings here
    ];
  }
else if (category === "Hospitality") {
    jobListings = [
      { title: "Hospitality Job 1", company: "Company 1" },
      { title: "Hospitality Job 2", company: "Company 2" },
      // Add more Hospitality job listings here
    ];
  }



    // Create HTML elements for each job listing
    jobListings.forEach(function(job) {
        const jobElement = document.createElement("div");
        jobElement.classList.add("job");
        jobElement.innerHTML = `
            <h3>${job.title}</h3>
            <p>${job.company}</p>
        `;
        jobContainer.appendChild(jobElement);
    });
}
