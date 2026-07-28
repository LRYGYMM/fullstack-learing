package com.lryg.sday2;

import java.util.TreeMap;

public class treemaptext {
    public static void main(String[] args) {
        TreeMap<Student,String> tm = new TreeMap<>();
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",19);
        Student s3 = new Student("wangwu",20);
        tm.put(s1,"河南");
        tm.put(s2,"上海");
        tm.put(s3,"北京");
        System.out.println(tm);

    }
}
