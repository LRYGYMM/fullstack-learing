package com.lryg;

public class Oop2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        System.out.println(
                s.getName() + " " + s.getAge() + " " + s.getSex() + " " + s.getHeight()
        );
        Student ss = new Student("张三", 18, "男", 175.5);
        System.out.println(ss.getName() + " " + ss.getAge() + " " + ss.getSex() + " " + ss.getHeight());
        ss.setName("李四");
        System.out.println(ss.getName() + " " + ss.getAge() + " " + ss.getSex() + " " + ss.getHeight());
    }
}
