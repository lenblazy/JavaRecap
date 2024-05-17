package org.example.interfaces.nested;

public class A {

    public interface NestedInterface {
        boolean issOdd(int num);
    }

}

class B implements A.NestedInterface {

    @Override
    public boolean issOdd(int num) {
        return (num & 1) == 1;
    }
}
