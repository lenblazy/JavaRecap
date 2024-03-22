package org.example.cyclic;

class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctIdx = nums[i] - 1;

                if (nums[i] != nums[correctIdx]) {
                    swap(nums, i, correctIdx);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = nums[temp];
    }

}