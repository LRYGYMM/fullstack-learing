package com.lryg.sday2;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDome {
    public static void main(String[] args) {
        String s = "abcdeaeaeebbbddcceeddbeebaa";
        TreeMap<Character,Integer> tm = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tm.containsKey(c)){
                int count = tm.get(c);
                count++;
                tm.put(c, count);
            }
            else {
                tm.put(c, 1);
            }
        }
        System.out.println( tm);
        StringBuilder sb = new StringBuilder();
        tm.forEach ((Character key, Integer value) -> {sb.append(key).append("(").append(value).append(")");});
        System.out.println(sb);

    }
}
