package org.example;

import java.util.Arrays;

public class PatternRec {

    public static void main(String[] args) {
//        triangle(4, 0);
        int[] arr = {5,6,7,8,9,1,2,3};
//        bubSort(arr, arr.length - 1, 0);
        selSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void invTriangle(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            System.out.print("* ");
            invTriangle(r, c + 1);
        } else {
            System.out.println();
            invTriangle(r - 1, 0);
        }
    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            triangle(r, c + 1);
            System.out.print("* ");
        } else {
            triangle(r - 1, 0);
            System.out.println();
        }
    }

    static void bubSort(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                //swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubSort(arr, r, c + 1);
        } else {
            bubSort(arr, r - 1, 0);
        }
    }

    static void selSort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[max]) {
                selSort(arr, r, c + 1, c);
            }else{
                selSort(arr, r, c + 1, max);
            }

        } else {
            //swap
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selSort(arr, r - 1, 0, 0);
        }
    }

}