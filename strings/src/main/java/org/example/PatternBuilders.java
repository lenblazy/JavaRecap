package org.example;

public class PatternBuilders {

    public static void main(String[] args) {
        pattern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);

        System.out.println();
        pattern4(4);

        System.out.println();
        pattern28(4);

//        System.out.println();
//        patternPyramid(4);

    }

    static void patternPyramid(int n) {
        int count = 1;
        for (int row = 1; row <= n; row++) { //n levels pyramid
            for (int col = 1; col <= row; col++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) { //no. of lines = no. of rows = no. of times loop will run
            //for every row run the column
            for (int col = 1; col <= n; col++) { //no. of columns = no. of times loop will run
                System.out.print("* ");
            }
            // when 1 row is printed add new line
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) { //no. of lines = no. of rows = no. of times loop will run
            //for every row run the column
            for (int col = 1; col <= row; col++) { //no. of columns = no. of times loop will run
                System.out.print("* ");
            }
            // when 1 row is printed add new line
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = n; row >= 1; row--) { //no. of lines = no. of rows = no. of times loop will run
            //for every row run the column
            for (int col = 1; col <= row; col++) { //no. of columns = no. of times loop will run
                System.out.print("* ");
            }
            // when 1 row is printed add new line
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) { //no. of lines = no. of rows = no. of times loop will run
            //for every row run the column
            for (int col = 1; col <= row; col++) { //no. of columns = no. of times loop will run
                System.out.print(col + " ");
            }
            // when 1 row is printed add new line
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) { //no. of lines = no. of rows = no. of times loop will run
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) { //no. of lines = no. of rows = no. of times loop will run
            int totalColsInRow = row > n ? 2 * n - row : row;

            int numOfSpaces = n - totalColsInRow;

            for (int space = 0; space < numOfSpaces; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
