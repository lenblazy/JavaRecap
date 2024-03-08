package org.example;

import java.util.Arrays;

public class BubSort {

    public static void main(String[] args) {
        //bubble sort the array
//        int[] arr = {5, 4, 3, 2, 1};
        int[] arr = {-7,-32,3,2,0};
//        int[] arr = {1,2,3,4,5};
        System.out.println("the arr before was " + Arrays.toString(arr));
        bubble(arr);
        System.out.println("the arr is now " + Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 steps
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //
            for (int j = 1; j < arr.length; j++) {
                // swap if item is smaller than previous array
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

}