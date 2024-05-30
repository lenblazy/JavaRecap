package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int j : arr) {
            System.out.println(j);
        }

        System.out.println(Arrays.toString(arr));

        String[] names = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};

        System.out.println(Arrays.toString(names));

        LinkedList<String> list = new LinkedList<>();
        list.add("Yow");
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Yow");
        list2.get(0);

        Stack<Integer> stack = new Stack<>();

    }
}