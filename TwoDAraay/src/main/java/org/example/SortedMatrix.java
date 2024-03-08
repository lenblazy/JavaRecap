package org.example;

public class SortedMatrix {

    public static void main(String[] args) {

    }

    static int[] searchSortedMatrix(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols / 2;

        // run the loop till 2 rows are remaining
        while(rowStart < (rowEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if (matrix[mid][colMid] == target){
                return new int[]{mid, colMid};
            }

            if (matrix[mid][colMid] < target){
                rowStart = mid;
            }else {
                rowEnd = mid;
            }
        }

        // Now we have two rows
        //check whether the target is in the column of two rows
        if (matrix[rowStart][colMid] == target){
            return new int[]{rowStart, colMid};
        }

        if (matrix[rowStart + 1][colMid] == target){
            return new int[]{rowStart + 1, colMid};
        }

        //search in

        return new int[]{-1, -1};
    }

    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        while (colStart <= colEnd){
            int mid = colStart + (colEnd - colStart) / 2;

            if (matrix[row][mid] == target){
                return new int[]{row, mid};
            }

            if (matrix[row][mid] < target){
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

}
