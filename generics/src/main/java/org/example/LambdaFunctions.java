package org.example;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

//        arr.forEach((item) -> System.out.println(item));

        Consumer<Integer> fun = System.out::println;
        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation product = (a, b) -> a * b;
        Operation minus = (a, b) -> a - b;

        LambdaFunctions obj = new LambdaFunctions();
        System.out.println(obj.operate(2, 3, sum));
        System.out.println(obj.operate(2, 3, product));
        System.out.println(obj.operate(2, 3, minus));
    }

   private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

}

interface Operation{
    int operation(int a, int b);

}
