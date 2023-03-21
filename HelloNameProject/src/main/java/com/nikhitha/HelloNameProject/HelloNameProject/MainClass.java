package com.nikhitha.HelloNameProject.HelloNameProject;

public class MainClass {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.name = "Eagle";
        bird1.color = "brown";
        bird1.canFly = true;

        Bird bird2 = new Bird();
        bird2.name = "Penguin";
        bird2.color = "black";
        bird2.canFly = false;

        Department department1 = new Department();
        department1 . name ="Physics";
        department1 . address ="Cincinnati";

        Department department2 = new Department();
        department2 . name ="Social";
        department2 . address ="Fremont";

        Department department3 = new Department();
        department3 . name ="Maths";
        department3 . address ="Dublin";

        Employee employee1 = new Employee();
        employee1.empId ="597";
        employee1.Age ="22";
        employee1.empName="aaa";
        employee1.isManager="false";

        Employee employee2 = new Employee();
        employee2.empId ="598";
        employee2.Age ="23";
        employee2.empName="bbb";
        employee2.isManager="True";



        System.out.println( bird1);
        System.out.println( bird2);
        System.out.println( department1);
        System.out.println( department2);
        System.out.println( department3);
        System.out.println( employee1);
        System.out.println( employee2);

    }
}

