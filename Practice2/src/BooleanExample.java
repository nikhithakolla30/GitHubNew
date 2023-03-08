public class BooleanExample {
    public static void main(String [] args){
        CanFly(true);
        CanFly(false);
    }
    public static void CanFly(boolean isBird){

        if(isBird == true){
            System.out.println("Can Fly");
        }
        else {
            System.out.println("Can not Fly");
        }
    }
}
