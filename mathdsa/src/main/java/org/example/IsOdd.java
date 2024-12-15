package org.example;

public class IsOdd {

    public static void main(String[] args) {
        System.out.println("IsOdd "+ isOdd(15));
        System.out.println("IsOdd "+ isOdd(14));
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(occursOnce(arr));
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    private static int occursOnce(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }

}
