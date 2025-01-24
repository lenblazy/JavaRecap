package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("maximum population " + maximumPopulation(new int[][]{
                {2033, 2034}, {2039, 2047}, {1998, 2042}, {2047, 2048}, {2025, 2029}, {2005, 2044}
        }));
    }

    static int maximumPopulation(int[][] logs) {
        // Create an array to hold population changes for years 1950 to 2050
        int[] populationChanges = new int[101];


        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            populationChanges[birth - 1950]++;
            populationChanges[death - 1950]--;
        }


        int maxPopulation = 0;
        int maxYear = 1950;
        int currentPopulation = 0;

        for (int year = 0; year < 101; year++) {
            currentPopulation += populationChanges[year];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxYear = 1950 + year;
            }
        }

        return maxYear;
    }
}