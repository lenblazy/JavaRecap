package org.example;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
//        int[] arr = {5, 4, 3, 2, 1};
        int[] arr = {-7, -32, 3, 2, 0};
//        int[] arr = {1,2,3,4,5};
        System.out.println("the arr before was " + Arrays.toString(arr));
        insertion(arr);
        System.out.println("the arr is now " + Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
