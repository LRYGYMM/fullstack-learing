package com.lryg;

public class Objecttext {
    public static void main(String[] args) {
        Student2 s =new Student2("张三",23);
        Student2 s1 =new Student2("张三",23);
        s.toString();
        System.out.println(s.toString());
        System.out.println(s.equals(s1));
    }
}
