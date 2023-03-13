package Warmup1;

public class missingChar {
    public static void main(String[] args) {
        missingChar obj = new missingChar();
        System.out.println(obj.missingChar("kitten", 1));
        System.out.println(obj.missingChar("kitten", 0));
        System.out.println(obj.missingChar("kitten", 4));

    }
    public String missingChar(String str, int n) {
        String before = str.substring(0, n);
        String after = str.substring(n+1);
        return before + after;
    }
}
