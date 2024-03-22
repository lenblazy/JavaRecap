package org.example;

import java.util.Arrays;

public class StrMethods {

    public static void main(String[] args) {
        String name = "John Doe";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('o'));
        System.out.println("   lennox     ".strip());
        System.out.println("   lennox     ".trim());
    }

}
