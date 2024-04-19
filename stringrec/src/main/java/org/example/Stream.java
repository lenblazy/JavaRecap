package org.example;

public class Stream {

    public static void main(String[] args) {
        System.out.println(skip( "baccdah"));
        System.out.println(skipApple("baccaappledssd"));
        System.out.println(skipAppNotApple("baccappappledssd"));
    }

    static void skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        if (c == 'a'){
            skip(p, up.substring(1));
        } else {
            skip(p + c, up.substring(1));
        }
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char c = up.charAt(0);
        if (c == 'a') {
            return skip(up.substring(1));
        } else {
            return c + skip(up.substring(1));
        }
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipApple(up.substring(3));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

}