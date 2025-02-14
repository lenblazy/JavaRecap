package org.example.ceiling;

public class CeilingQn {

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 6, 9, 14, 16, 18, 45,67,87,89,100};
        int target = 8;
        CeilingQn ceil = new CeilingQn();
        System.out.println("Ceiling of target "+ ceil.ceiling(a, target));
    }

    int ceiling(int[] arr, int target) {
        int startIdx = 0;
        int endIdx = arr.length - 1;

        if (target > arr[endIdx]) {
            return -1;
        }

        while (startIdx <= endIdx) {
            int mid = startIdx + (endIdx - startIdx) / 2;

            if (arr[mid] == target) {
                return target;
            }

            if (target > arr[mid]) {
                startIdx = mid + 1;
            } else {
                endIdx = mid - 1;
            }
        }

        return arr[startIdx];
    }

}
