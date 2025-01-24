package org.example;

import java.util.Arrays;

public class SeivePrime { //T(C) = O(n * log(log(n))

    public static void main(String[] args) {
//        int n = 40;
//        boolean[] primes = new boolean[n + 1];
//        sieveOfEratosthenes(n, primes);
        int[] nums = {3, 2, 7, 2, 3, 4};
        System.out.println("Two sum "+ Arrays.toString(twoSum(nums, 6)));
    }

    // false in array means number is prime
    static void sieveOfEratosthenes(int n, boolean[] primes) {

        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }

    }

    static int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int i,j;
        for(i=1;i<nums.length;i++){
            for(j=i;j<nums.length;j++){
                if(nums[j]+nums[j-i]==target){
                    arr[0]=j;
                    arr[1]=j-i;
                    return arr;
                }
            }
        }
        return arr;
    }

}
