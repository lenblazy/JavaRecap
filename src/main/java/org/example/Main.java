package org.example;

import org.example.enums.Animal;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        MyStrBuilder strBuilder = new MyStrBuilder();
//        strBuilder.buildStr();

//        Robot robot = new Robot(7);
//        robot.start();
//
//        Robot.Battery battery = new Robot.Battery();
//        battery.charge();

        Animal animal = Animal.CAT;

        switch (animal) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;
            default:
                break;
        }

    }
}