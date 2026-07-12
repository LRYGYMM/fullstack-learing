package com.lryg;

public class Oop_learing {
    /*利用面向对象思想表示狗狗(属性:名字，年龄，体重，毛发颜色)
    利用面向对象思想表示学生(属性:名字，性别，年龄，身高)
    课堂作业:利用面向对象思想表示手机(属性:品牌，颜色，价格)*/

    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("旺财");
        d.setAge(12);
        System.out.println(d.getName() + d.getAge());
        d.eat();

    }
}
