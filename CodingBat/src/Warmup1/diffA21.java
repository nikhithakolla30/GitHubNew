package Warmup1;

public class diffA21 {
    public static void main(String[] args) {
        diff21 obj = new diff21();
        System.out.println(obj.diff21(10));
        System.out.println(obj.diff21(21));
        System.out.println(obj.diff21(25));
    }
}

class diff21 {
    public int diff21(int n) {
        int diff = Math.abs(n - 21);
        if (n > 21) {
            return diff * 2;
        } else {
            return diff;
        }
    }
}