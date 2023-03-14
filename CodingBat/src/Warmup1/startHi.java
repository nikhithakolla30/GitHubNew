package Warmup1;
public class startHi {
    public static void main(String [] args){
        startHi obj = new startHi();
        System.out.println(obj.startHi("hi there"));
        System.out.println(obj.startHi("hi"));
        System.out.println(obj.startHi("there"));
    }
    public boolean startHi(String str) {
        return (str.startsWith("hi"));
    }
}
