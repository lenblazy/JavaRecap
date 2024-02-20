package org.example;

import org.example.innerclass.Robot;
import org.example.string.MyStrBuilder;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        MyStrBuilder strBuilder = new MyStrBuilder();
//        strBuilder.buildStr();

        Robot robot = new Robot(7);
        robot.start();

        Robot.Battery battery = new Robot.Battery();
        battery.charge();

    }
}