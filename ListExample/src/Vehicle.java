public class Vehicle {
    protected String color;
    protected int noOfTyres;
    protected int noOfWindows;

    public void soundHorn() {
        System.out.println("Beep Beep!");
    }
}

class Car extends Vehicle {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.color = "red";
        car1.noOfTyres = 4;
        car1.noOfWindows = 4;
        car1.soundHorn();
    }
}





