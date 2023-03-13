package Warmup1;

public class notString {
    public static void main(String[] args) {
        notString obj = new notString();
        System.out.println(obj.notString("candy"));
        System.out.println(obj.notString("x"));
        System.out.println(obj.notString("not bad"));
    }

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }
}