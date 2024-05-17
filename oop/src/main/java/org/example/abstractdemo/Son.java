package org.example.abstractdemo;

public class Son extends Parent {
    @Override
    void career(String name) {
        System.out.println("I am going start a " + name + " career");
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love my partner " + name + " who is " + age + " years old");
    }
}
