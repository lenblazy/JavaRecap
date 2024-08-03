package org.example;

import java.io.*;

public class Main {

    private static String filePath = "filehandling/src/main/resources/new-file.txt";

    public static void main(String[] args) {
        createF();
        write();
        read();
    }

    private static void createF() {
        try {
            File fob = new File(filePath);
            fob.createNewFile();
//            if (fob.delete()){
//                System.out.println(fob.getName());
//            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void write() {
        // Output =====

//        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
//            osw.write("Hello World!");
//            osw.write(97);
//            osw.write(10);
//            osw.write('\n');
//            char[] arr = "Hello world".toCharArray();
//            osw.write(arr);
//            osw.write(97);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try (FileWriter fw = new FileWriter("filehandling/src/main/resources/note.txt", true)) {
//            fw.write("Hello World!");
//            fw.write(97);
//            fw.write(10);
//            fw.write('\n');
//            char[] arr = "Hello world".toCharArray();
//            fw.write(arr);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write("Buffered writer World!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void read() {
        // Input =====

//        try (InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.println("Enter some letters:");
//            int letters = isr.read();
//            while (isr.ready()) {
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//            System.out.println();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        try (FileReader isr = new FileReader("filehandling/src/main/resources/note.txt")) {
//            System.out.println("Enter some letters:");
//            int letters = isr.read();
//            while (isr.ready()) {
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//            System.out.println();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            System.out.println("You typed: " + br.readLine());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        ///////
    }
}