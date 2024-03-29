package org.example;

public class Operators {

    public static void main(String[] args) {
        byte n = 127;
//        System.out.println(isOdd(n));

//        int[] arr = {2, 3, 3, 4, 2, 6, 4};
//        System.out.println(findUnique(arr));
//        int[] arr = {2, 2, 3, 7, 7, 8, 7, 8, 8};
//        System.out.println(findUniqueAppearing3Times(arr));
    }

    private static boolean isOdd(byte n) {
        return (n & 1) == 1;
    }

    private static int findUnique(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }

        return unique;
    }

    private static int findUniqueAppearing3Times(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique &= n;
        }

        return unique;
    }

}
