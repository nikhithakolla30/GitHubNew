package Warmup1;

public class front22 {
    public static void main(String [] args){
        front22 obj = new front22();
        System.out.println(obj.front22("Kitten"));
        System.out.println(obj.front22("java"));
        System.out.println(obj.front22("ab"));
        System.out.println(obj.front22("abc"));
    }
    public String front22(String str) {
        String front;
        if (str.length() < 2) {
            front = str;
        } else {
            front = str.substring(0, 2);
        }
        return front + str + front;
    }
}
