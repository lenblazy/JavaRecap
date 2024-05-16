package org.example.intro;

public class ObjGarbageCollector {
    public static void main(String[] args) {

        A obj;
        for (int i = 0; i < 100_000_000; i++) {
            obj = new A("new value");
        }


    }
}

class A{
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}