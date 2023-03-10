package Warmup1;
public class SleepInClass {
    public static void main(String[] args) {
        System.out.println(sleepIn(true, true));    
        System.out.println(sleepIn(true, false));   
        System.out.println(sleepIn(false, true));   
        System.out.println(sleepIn(false, false));  
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}
