package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDimensArrays {

    public static void main(String[] args) {
//        int[][] ints1 = { {3,5,8} ,{6,8,4} };
//        int[][] ints2 = { {3,5,8} ,{6,8,4} };
//        print2DArray(ints1);

        System.out.println("Lucky number: "+ luckyNumbers(new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}}));
    }

    private static void print2DArray(int[][] arr) {
        System.out.printf("2D Array: %s", Arrays.deepToString(arr));
        System.out.printf("2D Array: %s", Arrays.toString(arr));
    }

    private static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            // Find the column of the minimum element in this row
            int minCol = findMinColumn(matrix, i);
            int candidate = matrix[i][minCol];

            // Check if this minimum is also the maximum in its column
            if (isMaxInColumn(matrix, candidate, minCol)) {
                result.add(candidate);
            }
        }

        return result;
    }

    private static int findMinColumn(int[][] matrix, int row) {
        int minVal = matrix[row][0], minCol = 0;
        for (int j = 1; j < matrix[row].length; j++) {
            if (matrix[row][j] < minVal) {
                minVal = matrix[row][j];
                minCol = j;
            }
        }
        return minCol;
    }

    private static boolean isMaxInColumn(int[][] matrix, int val, int col) {
        for (int[] cols : matrix) {
            if (cols[col] > val) return false;
        }
        return true;
    }

}
