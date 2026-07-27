package com.lryg.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        //通过一个方法获取所有的键值对象，返回一个set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
