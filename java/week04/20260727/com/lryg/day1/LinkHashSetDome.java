package com.lryg.day1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSetDome {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        Student s2 =new Student("李四", 19);
        Student s3 = new Student("王五", 20);
        Student s4 = new Student("张三", 19);
        LinkedHashSet<Student> set = new LinkedHashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
