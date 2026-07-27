package com.lryg.day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A01_SetDome1 {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet();
        mySet.add("hello");
        mySet.add("world");
        //mySet.add("hello");
        System.out.println(mySet.size());
        System.out.println(mySet.contains("hello"));
        System.out.println(mySet.contains("world"));
        System.out.println(mySet.contains("java"));
        //迭代器添加遍历
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //for each 添加遍历
        for (String s : mySet) {
            System.out.println(s);
        }
        //lambda 表达式添加遍历
        mySet.forEach(str -> System.out.println(str));

    }
}
