public class PrimeNumber {
    main(20);
    public static void main(int n) {
        int count = 0;
        if (n <= 1) {
            System.out.println("not prime");
            return;
        }

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("not prime");
        }
        else {
            System.out.println("prime");
        }
    }
}
