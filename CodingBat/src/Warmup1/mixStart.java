package Warmup1;

public class mixStart {
v

    public boolean mixStart(String str) {
        if (str.length() >= 3) {
            if (str.substring(1, 3).equals("ix")) {
                return true;
            }
        }
        return false;
    }

}
