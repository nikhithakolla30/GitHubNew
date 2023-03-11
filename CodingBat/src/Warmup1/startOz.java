package Warmup1;

public class startOz {
    public static void main(String[] args) {
            startOz test = new startOz();
            String output = test.startOz("ozymandias");
            System.out.println(output);
    }
    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += 'o';
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += 'z';
        }
        return result;
    }
}
