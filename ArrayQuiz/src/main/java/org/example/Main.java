package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Numbers " +findNumbers(new int[]{12, 345, 2, 6, 7896}));
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            count += (((int) Math.log10(num) + 1) & 1) == 0 ? 1 : 0;
        }

        return count;
    }
}