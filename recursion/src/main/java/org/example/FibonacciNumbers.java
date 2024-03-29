package org.example;

public class FibonacciNumbers {

    public static void main(String[] args) {
//        int ans = fibo(4);
        int ans = fiboFormula(50);
        System.out.println(ans);
    }

    static int fibo(int n) {

        // base condition
        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    static int fiboFormula(int n) {
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

}
