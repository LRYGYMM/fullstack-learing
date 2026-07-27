package com.lryg.day1;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        Student s2 =new Student("李四", 19);
        Student s3 = new Student("王五", 20);
        Student s4 = new Student("张三", 18);
        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);

    }
}
