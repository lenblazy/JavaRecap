package org.example.evendigits;

/*
Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.
 */

public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        int[] nums2 = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        System.out.println(findNumbers(nums2));
        System.out.println(digits(0));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isEven(num)) count++;
        }
        return count;
    }

    static boolean isEven(int num) {
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;

        if (num < 0) {
            num *= -1;
        }

        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    static int digits2(int num) {
        if (num < 0) {
            num *= -1;
        }

        return (int)(Math.log10(num)) + 1;
    }

}
