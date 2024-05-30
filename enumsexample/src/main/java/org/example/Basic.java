package org.example;

public class Basic {

    enum Week{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        // ENUM CONSTANTS
        // public, static and final
        // you can create child enums
        // type is week


        Week() {
            System.out.println("Constructor called for " + this);
        }
        // this is not public or protected, only private or default


    }

    public static void main(String[] args) {
        Week week;
        week = Week.SUNDAY;

        System.out.println(Week.valueOf("SUNDAY"));
//        System.out.println(week);
//        System.out.println(week.ordinal()); // prints index of enum

//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }
    }

}