package org.example;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
//selection sort the array
        int[] arr = {5, 4, 3, 2, 1};
//        int[] arr = {-7, -32, 3, 2, 0};
//        int[] arr = {1,2,3,4,5};
        System.out.println("the arr before was " + Arrays.toString(arr));
        sortSelect(arr);
        System.out.println("the arr is now " + Arrays.toString(arr));
    }

    static void sortSelect(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = maxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int maxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}
