package org.example;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 5, 1};
        System.out.println("Before " + Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("After " + Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;
            if (arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
