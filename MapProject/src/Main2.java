import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main (String[] args){
        Map<String,String> myMap = new HashMap<String,String>();
        myMap.put("Telengana", "Hyderabad");
        myMap.put("Karnataka","Banglore");
        myMap.put("Tamilnadu","Chennai");
        myMap.put("Maharastra","Mumbai");
        System.out.println(myMap);
    }
}