package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDimensArrays {

    public static void main(String[] args) {
//        int[][] ints1 = { {3,5,8} ,{6,8,4} };
//        int[][] ints2 = { {3,5,8} ,{6,8,4} };
//        print2DArray(ints1);

//        System.out.println("Lucky number: "+ luckyNumbers(new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}}));
//        System.out.println("Reshape matrix: "+ Arrays.deepToString(matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4)));


//        System.out.println("Ans: "+ sumTwoSmallestNumbers(new long []{10, 343445353, 3453445, 3453545353453L}));
        System.out.println(friend(List.of("Ryan", "Kieran", "Jason", "Yous")));
    }

    private static List<String> friend(List<String> x){
        // Your code here
        List<String> ans = new ArrayList<>();
        for (String str: x) {
            if (str.length() == 4) {
                ans.add(str);
            }
        }
        return ans;
    }

    private static long sumTwoSmallestNumbers(long[] numbers) {
        //Your solution here
        int startIdx = 0;
        int endIdx = numbers.length - 1;
        long minEnd = numbers[endIdx];
        long minStart = numbers[startIdx];

        while (startIdx < endIdx - 1) {
            if (minStart > numbers[startIdx + 1]) {
                minStart = numbers[startIdx + 1];
                ++startIdx;
            }

            if (minEnd > numbers[endIdx - 1]) {
                minEnd = numbers[endIdx - 1];
                --endIdx;
            }
        }


        return minEnd + minStart;
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

      private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int matRowLen = mat.length, matColLen = mat[0].length;
        if (r * c != matRowLen * matColLen) return mat;

        int[][] resultMat = new int[r][c];

        for (int matRow = 0, resultMatRow = 0, resultMatCol = 0; matRow < matRowLen; matRow++) {
            for (int matCol = 0; matCol < matColLen; matCol++, resultMatCol++) {
                if (resultMatCol == c) {
                    resultMatRow++;
                    resultMatCol = 0;
                }
                resultMat[resultMatRow][resultMatCol] = mat[matRow][matCol];
            }
        }

        return resultMat;
    }

}
