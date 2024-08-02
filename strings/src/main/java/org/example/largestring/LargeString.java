package org.example.largestring;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class LargeString {


    public static void main(String[] args) {
        // Constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        // Constructor 2
        StringBuffer sb2 = new StringBuffer("Leni Boyd");

        // Constructor 3
        StringBuffer sb3 = new StringBuffer(30); // initial capacity
        System.out.println(sb3.capacity());

        sb.append("WeMAkeDevs");
        sb.append("is nice");
        sb.insert(2, " Bonje ");
        sb.replace(1,5, "Haha");
        sb.delete(1,5);
//        sb.reverse();

        String str = sb.toString();
        System.out.println(str);

        randomStr(20);

        String sentence = "Hi sd sdhjjhdss dsjh    sdh stew sdu";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s", ""));
        System.out.println(sentence.replace(" ", ""));

        // split
        String arr = "Lennox Brown Mwabonje";
        String[] words = arr.split("\\s");
        System.out.println(Arrays.toString(words));

        // rounding off
        DecimalFormat df = new DecimalFormat("00.00000");
        System.out.println(df.format(7.2));
    }

    // ----------------------------------------------------------------
    // StringBuffer Advantages
    // 1. StringBuffer is mutable
    // 2. Efficient
    // 3. Thread-safe (Slower) - Multiple threads working on same data.
    // Prevent any other thread when one thread is working on it. (StringBuilder not thread safe)
    //

    private static void randomStr(int size){
        StringBuffer sb = new StringBuffer(size);

        Random random = new Random();

        for (int i =0; i < size; i++){
            int randomChar = 97 + (int)(random.nextFloat() * 26);
            sb.append((char) randomChar);
        }

        System.out.println(sb.toString());
    }

}
