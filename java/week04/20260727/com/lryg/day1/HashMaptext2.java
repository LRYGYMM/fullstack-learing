package com.lryg.day1;

import java.util.*;

public class HashMaptext2 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, count + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        System.out.println("Max count: " + max);


     for (Map.Entry<String, Integer> entry : entries) {
        if (entry.getValue() == max) {
            max = entry.getValue();
            System.out.println(entry.getKey());
        }
    }


}
}
