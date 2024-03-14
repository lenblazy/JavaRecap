package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static void read(){
        String fileName = "/Volumes/Development/personal/java/JavaTute/JavaRecap/JavaRecap/sorting/src/main/resources/message.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line = reader.readLine();

            StringBuilder decoded = new StringBuilder();
            String[] words = new String[line.length()];
            int row = 0;

            while (line != null){
                String[] wordsLine = line.split(" ");
                int number = Integer.parseInt(wordsLine[0]);

                if (number == row){
                    decoded.append(number);
                    decoded.append(": ");
                    decoded.append(wordsLine[1]);
                    row++;
                }
                line = reader.readLine();
            }

            System.out.println(decoded);

        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}