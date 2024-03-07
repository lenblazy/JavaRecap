package org.example;

/*
Given an array arr[] of size N having distinct numbers sorted in increasing order
and the array has been right rotated (i.e, the last element will be cyclically shifted
to the starting position of the array) k number of times, the task is to find the value of k.

Examples:

Input: arr[] = {15, 18, 2, 3, 6, 12}
Output: 2
Explanation: Initial array must be {2, 3, 6, 12, 15, 18}.
We get the given array after rotating the initial array twice.

Input: arr[] = {7, 9, 11, 12, 5}
Output: 4

Input: arr[] = {7, 9, 11, 12, 15};
Output: 0
 */
public class RotationCount {

    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 15};
        int[] arr1 = {4,5,6,7,0,1,2,3};
        System.out.println(countRotations(arr1));
    }

    static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        return ++pivot;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;

    }

    static int findPivotDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip dupes
                if (arr[start] > arr[start + 1]) {
                    return start;
                }

                start++;

                if (arr[end] > arr[end - 1]) {
                    return end - 1;
                }
                end--;

            }
            //left side sorted, so pivot should be in the right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }

        return -1;

    }

}
