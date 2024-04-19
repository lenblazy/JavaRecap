package org.example;

public class Ascii {

    public static void main(String[] args) {
//        char c = 'a';
//        System.out.println(c + 0);
        subSeqAscii("", "abc");
    }

    static void subSeqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        subSeqAscii(p + c, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + (c + 0), up.substring(1));
    }

}
