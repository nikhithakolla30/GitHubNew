import java.util.LinkedHashMap;
import java.util.Map;

public class Main3 {
    public static void main (String[] args){
        Map<String,Integer> Details = new LinkedHashMap<String,Integer>();
        Details.put("Thanuja",1);
        Details.put("abc",2);
        Details.put("xyz",3);
        System.out.println(Details);

        //LinkedHAshMap  --- is used to print the output in order
    }
}
