package org.example;

public class Factors {

    public static void main(String[] args) {
        factors1(20);
    }

    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                System.out.println(i + " ");
            }
        }
    }

}
