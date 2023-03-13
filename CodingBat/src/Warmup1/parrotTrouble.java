package Warmup1;

public class parrotTrouble {
    public static void main(String[] args) {
        parrotTrouble obj = new parrotTrouble();
        System.out.println(obj.parrotTrouble(true, 6));
        System.out.println(obj.parrotTrouble(true, 7));
        System.out.println(obj.parrotTrouble(false, 6));
        System.out.println(obj.parrotTrouble(true, 21));
        System.out.println(obj.parrotTrouble(false, 21));
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }
}