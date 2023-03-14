package Warmup1;

public class icyHot {
    public static void main(String [] args){
        icyHot obj = new icyHot();
        System.out.println(obj.icyHot(120,-1));
    }
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }
}
