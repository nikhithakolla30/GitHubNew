package Warmup1;

class Makes10 {
    public static void main(String[] args) {
        Makes10 obj = new Makes10();
        System.out.println(obj.makes10(9, 10));
        System.out.println(obj.makes10(9, 9));
        System.out.println(obj.makes10(1, 9));
    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        } else {
            return false;
        }
    }
}