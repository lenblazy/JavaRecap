package org.example;

import java.util.ArrayList;

public class Main {
    /*Str = abc
     * permutations = [abc, bac, cab, bac, acb, ...]*/
    public static void main(String[] args) {
//        permute("", "abc");
        System.out.println("List is " + permuteList("","abc"));
    }

    private static void permute(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permute(f + ch + s, up.substring(1));
        }

    }

    private static ArrayList<String> permuteList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permuteList(f + ch + s, up.substring(1)));
        }

        return ans;
    }

}