package org.example;

public class NewtonSqrt {

    public static void main(String[] args) {
        System.out.println(newtonSqrt(4));
    }

    static double newtonSqrt(double n) {
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + (n/x));
            if (Math.abs(root - x) < 1) {
                break;
            }
            x = root;
        }
        return root;
    }

}
