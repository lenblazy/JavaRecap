package org.example;

import java.util.Arrays;

public class TwoDimensArrays {

    public static void main(String[] args) {
        int[][] ints1 = { {3,5,8} ,{6,8,4} };
        int[][] ints2 = { {3,5,8} ,{6,8,4} };
        print2DArray(ints1);
    }

    private static void print2DArray(int[][] arr) {
        System.out.printf("2D Array: %s", Arrays.deepToString(arr));
        System.out.printf("2D Array: %s", Arrays.toString(arr));
    }



}
