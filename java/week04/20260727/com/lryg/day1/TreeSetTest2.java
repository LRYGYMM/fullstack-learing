package com.lryg.day1;

import java.util.TreeSet;

public class TreeSetTest2 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        Student s2 =new Student("李四", 19);
        Student s3 = new Student("王五", 20);
        Student s4 = new Student("张三", 19);
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        System.out.println(treeSet);
    }

}
