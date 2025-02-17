package org.example.sqrt;

public class SquareRoot {

    public static void main(String[] args) {
        SquareRoot rt = new SquareRoot();
        System.out.println("Square root of 8 is "+ rt.mySqrt(8));
    }

    public int mySqrt(int num) {
        if (num == 0 || num == 1) return num;

        int start = 1;
        int end = num;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if ((long) mid * mid > (long) num) {
                end = mid - 1;
            } else if (mid * mid == num) {
                return mid;
            } else {
                start = mid + 1;
            }
        }

        return Math.round(end);
    }

}
