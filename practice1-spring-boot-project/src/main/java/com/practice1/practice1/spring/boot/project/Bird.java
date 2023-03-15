package com.practice1.practice1.spring.boot.project;

public class Bird {
    String color;
    Boolean canFly;

    public static void main(String[] args) {
        Bird eagle = new Bird();
        eagle.color = "brown";
        eagle.canFly = true;

        System.out.println("Eagle color: " + eagle.color);
        System.out.println("Can eagle  fly? " + eagle.canFly);
    }
}