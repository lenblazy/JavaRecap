package org.example.cyclic;

import java.util.Arrays;

public class MyCyclicSort {

    public static void main(String[] args) {

        MyCyclicSort st = new MyCyclicSort();
        int[] nums = {3,5,2,1,4};
//        int[] nums = {5,4,3,2,1};
        st.cycleSort(nums);
        System.out.println("Sorted arr " + Arrays.toString(nums));
    }

    void cycleSort(int[] arr) {
        int currentIdx = 0;
        while (currentIdx < arr.length) {
            int correctIdx = arr[currentIdx] - 1;
            if (currentIdx != correctIdx) {
                swap(arr, correctIdx, currentIdx);
            } else {
                ++currentIdx;
            }
        }
    }

    void swap(int[] arr, int idxCorrect, int idxWrong) {
        int temp = arr[idxCorrect];
        arr[idxCorrect] = arr[idxWrong];
        arr[idxWrong] = temp;
    }

}
