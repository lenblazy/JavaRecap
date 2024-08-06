package org.example;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String , Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map.get("one"));
        System.out.println(map.getOrDefault("four", -1));

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(56);
        System.out.println(set);

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("two", 2);
        treeMap.put("one", 1);
        treeMap.put("three", 3);
    }
}