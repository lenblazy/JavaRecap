package org.example.comparing;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student leni = new Student( 20,99.9f);
        Student queen = new Student( 5,89.9f);
        Student kuku = new Student( 7,76.9f);
        Student bata = new Student( 4,44.5f);
        Student kanga = new Student( 3,64.9f);

        Student[] students = {leni, queen, kuku, bata, kanga};

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        if (queen.compareTo(leni) < 0) {
            System.out.println(queen.compareTo(leni));
            System.out.println("Leni has more marks than Queen");
        }

    }

}
