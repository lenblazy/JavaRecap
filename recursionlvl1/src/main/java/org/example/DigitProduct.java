package org.example;

public class DigitProduct {

    public static void main(String[] args) {
        System.out.println(multipleDigits(12345));
    }

    static int multipleDigits(int n) {

        if (n%10 == n) {
            return n;
        }

        return n % 10 + multipleDigits(n / 10);
    }

}
