package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {-10,-1,0,2, 4, 45, 45, 45, 54};
        int target = 55;
        int ans = binarySearch(a, target);
        System.out.println(ans);
    }

    // return index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
//            int mid = (start + end) / 2; // This might cause int overflow in JAVA is numbers are large
            int mid = start + (end - start) / 2; // Efficient way

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //answer found
                return mid;
            }
        }

        return -1;
    }

}
