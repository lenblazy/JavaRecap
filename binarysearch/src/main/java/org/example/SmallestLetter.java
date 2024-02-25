package org.example;

import java.util.Arrays;

/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.



Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].


Constraints:

2 <= letters.length <= 104
letters[i] is a lowercase English letter.
letters is sorted in non-decreasing order.
letters contains at least two different characters.
target is a lowercase English letter.
 */
public class SmallestLetter {

    public static void main(String[] args) {
//        char[] letters = {'c', 'f', 'j'};
        int a = 2;
        int b = 11;
        int an = a % b;
        System.out.println(an);
        char[] letters = {'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'c', 'd'};
        char target = 'd';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }

        int idx = start % arr.length;
        System.out.println("START is "+ start);
        System.out.println("Arr len is "+ arr.length);
        System.out.println("Array contains "+ Arrays.toString(arr));

        return arr[idx] ;

    }


}
