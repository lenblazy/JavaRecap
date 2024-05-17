package org.example.interfaces.defaultimpl;

public interface A {

    default void fun(){
        System.out.println("A");
    }
}
