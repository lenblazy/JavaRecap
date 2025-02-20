package org.example;

public class CountNegatives2D {

    public static void main(String[] args) {
        CountNegatives2D twoD = new CountNegatives2D();
        int[][] arr = {
                {5, 1, 0},
                {-5, -5, -5}
        };
        System.out.println("Ans " + twoD.countNegatives(arr));
    }

    public int countNegatives(int[][] grid) {
        int row = 0;
        int col = grid[row].length - 1;
        int count = 0;

        while (row < grid.length && col >= 0) {
            if (grid[row][col] < 0) {
                count += (grid.length - row);
                col--;
            } else if (grid[row][col] >= 0) {
                row++;
            }

        }

        return count;
    }

}
