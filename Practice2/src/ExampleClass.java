public class ExampleClass {
    public static void main(String[] args) {
        int result = getSum(2, 3);
        System.out.println(" " + result);
        int result4 = getReminder(6 , 3);
        System.out.println(" " + result4);


    }
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static int getReminder(int a, int b) {
        int Reminder = a / b;
        return Reminder;
    }
    public static void Repeat(String[] args) {
        String name = "Nikhitha";
        for (int i = 0; i < 7; i++) {
            System.out.println(name +" ");
        }
    }

}
