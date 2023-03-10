package Warmup1;
public class SleepInClass {
    public static void main(String[] args) {
        System.out.println(sleepIn(true, true));    // true
        System.out.println(sleepIn(true, false));   // false
        System.out.println(sleepIn(false, true));   // true
        System.out.println(sleepIn(false, false));  // true
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}