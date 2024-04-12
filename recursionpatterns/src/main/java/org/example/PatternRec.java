package org.example;

public class PatternRec {

    public static void main(String[] args) {
        triangle(4, 0);
    }

    static void invTriangle(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            System.out.print("* ");
            invTriangle(r, c + 1);
        } else {
            System.out.println();
            invTriangle(r - 1, 0);
        }
    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            triangle(r, c + 1);
            System.out.print("* ");
        } else {
            triangle(r - 1, 0);
            System.out.println();
        }
    }

}