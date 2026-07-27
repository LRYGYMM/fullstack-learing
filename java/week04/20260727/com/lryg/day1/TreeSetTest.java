package com.lryg.day1;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

// 类名修改，不再和工具类重名
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(5);
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----------------------------------------------------");
        treeSet.forEach( i -> {System.out.println(i);});
    }
}