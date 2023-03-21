import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args){
        Map<String,Integer> StudentDetails = new HashMap<String,Integer>();
        StudentDetails.put("thanuja",1);
        StudentDetails.put("abc",2);
        StudentDetails.put("xyz",3);
        System.out.println(StudentDetails);
    }
}