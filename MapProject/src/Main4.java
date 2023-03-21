import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main4 {
    public static void main (String[] args){
        Map<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        Map<Integer, Integer> details = concurrentHashMap;
        details.put(1, 2);
        details.put(2, 3);
        System.out.println(details);
    }
}
