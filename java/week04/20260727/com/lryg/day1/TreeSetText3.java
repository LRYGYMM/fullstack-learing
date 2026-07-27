package com.lryg.day1;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetText3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(( o1,  o2) ->{
                int i = o1.length() - o2.length();
                return i == 0 ? o1.compareTo(o2) : i;
        });
        treeSet.add("c");
        treeSet.add("ab");
        treeSet.add("df");
        treeSet.add("qwer");
        System.out.println(treeSet);

    }
}
