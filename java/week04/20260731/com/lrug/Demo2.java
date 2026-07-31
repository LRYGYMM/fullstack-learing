package com.lrug;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        //双列集合
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.keySet().stream().forEach(s-> System.out.println(s));
        map.entrySet().stream().forEach(s-> System.out.println(s));
    }
}
