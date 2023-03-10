package Warmup1;

public class intMax {
    public static void main(String[] args) {
       System.out.println(intMax(10,14,13));
    }
        public static int intMax ( int a, int b, int c){
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            return max;
        }

}