import java.security.PublicKey;

public class PracticeProject {
    public static void main(String[] args) {
        System.out.println("Hello Nikhitha");

        int result = getSum(2, 3);
        System.out.println("Sum of 2 and 3 is = " + result);
        int result1 = getDiff(3, 2);
        System.out.println("Diff of 3 and 2 is = " + result1);
        int result2 = getProduct(3, 2);
        System.out.println("Prod of 3 and 2 is = " + result2);
        int result4 = getDivision(3, 2);
        System.out.println("Division of 3 and 2 is = " + result4);
        printNumbers(7);
        EvenNumber(10);
        EvenOdd(10);
    }
        public static void EvenNumber(int m) {
            for (int i = 1; i <= m; i++) {
                if (i % 2 == 0)
                {
                    System.out.println(i);
                }
            }
        }

    public static void EvenOdd(int O) {
        for (int j = 1; j <= O; j++) {
            if (j % 2 == 0) {
                System.out.println(j + "  Even");
            }
            else {
                System.out.println(j + "  Odd");
            }
        }
    }


    public static void printNumbers(int n)
        {
        for(int i=0; i<=n; i++){
        System.out.println(i);
        }
  }
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int getDiff(int a, int b) {
        int Diff = a - b;
        return Diff;
    }

    public static int getProduct(int a, int b) {
        int Product = a * b;
        return Product;
    }

    public static int getDivision(int a, int b) {
        int Division = a / b;
        return Division;
    }

    }