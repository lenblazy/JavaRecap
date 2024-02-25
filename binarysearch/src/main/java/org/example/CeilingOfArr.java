package org.example;

public class CeilingOfArr {

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 9, 14, 16, 18};
        int target = 9;
        int ans = ceilingOfArr(a, target);
        int ansB = floorOfArr(a, target);
        System.out.println(ans);
        System.out.println(ansB);
    }

    static int ceilingOfArr(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }


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
                return arr[mid];
            }
        }

        return arr[start];
    }

    static int floorOfArr(int[] a, int target) {
        if (target < a[0]) {
            return -1;
        }
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                start = mid + 1;
            }
            else {
                //answer found
                return a[mid];
            }
        }

        return a[end];
    }

}
