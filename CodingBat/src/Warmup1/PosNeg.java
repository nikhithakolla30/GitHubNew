package Warmup1;

public class PosNeg {
    public static void main(String[] args) {
        PosNeg obj = new PosNeg();
        System.out.println(obj.posNeg(1, -1, false));  // true
        System.out.println(obj.posNeg(-1, 1, false));  // true
        System.out.println(obj.posNeg(-4, -5, true));  // true
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
}