package org.example;

public class InfiniteArray {

    public static void main(String[] args) {
        // start with array of size 2

    }

    static int ans(int[] arr, int target){
        // first find range
        // first with start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for target to lie in range
        while (target > arr[end]){
            int temp = end + 1; // a new start value

            // double the box value
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
