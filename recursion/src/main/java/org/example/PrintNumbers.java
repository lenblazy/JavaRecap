package org.example;

public class PrintNumbers {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n == 5) {
            return;
        }
        System.out.println(n);
        print(n + 1); //tail recursion since it is the last function call
    }

}