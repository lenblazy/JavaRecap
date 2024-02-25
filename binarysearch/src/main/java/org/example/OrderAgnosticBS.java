package org.example;

public class OrderAgnosticBS {

    public static void main(String[] args) {
        int[] a = {-10,-1,0,2, 4, 45, 45, 45, 54};
        int target = 55;
        int ans = orderAgnosticBs(a, target);
        System.out.println(ans);


    }

    static int orderAgnosticBs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether array is sorted in ascending order or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
//            int mid = (start + end) / 2; // This might cause int overflow in JAVA is numbers are large
            int mid = start + (end - start) / 2; // Efficient way

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

}
