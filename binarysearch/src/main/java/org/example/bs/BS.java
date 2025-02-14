package org.example.bs;

public class BS {

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 6, 9, 14, 16, 18, 45,67,87,89,100};
        int target = 9;
        BS bs = new BS();
        System.out.println("Index of target "+ bs.indexOfTarget(a, target));
    }

    /**
     * Binary search on sorted array
     * */
    private int indexOfTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

}
