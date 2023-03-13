package Warmup1;

public class frontBack {
    public static void main(String[] args){
        frontBack obj = new frontBack();
        System.out.println(obj.frontBack("code"));
        System.out.println(obj.frontBack("a"));
        System.out.println(obj.frontBack("ab"));
    }
    public String frontBack(String str) {
        int length = str.length();
        if (length == 0 || length ==1) {
            return str;
        }
        char first = str.charAt(0);
        char last = str.charAt(length-1);
        String middle = str.substring(1, str.length()-1);
        return last + middle + first;
    }

}
