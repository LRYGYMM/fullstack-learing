package com.lryg.s20260724;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collectiontext {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Hello");
        coll.add("World");
        System.out.println(coll);
        //coll.clear();
        //coll.remove("Hello");//布尔类型

        System.out.println(coll);
        //底层是依赖于equals方法的 如果集合里面是自定义的对象 也想通过contains方法判断是否包含某个对象 那么需要重写equals方法
        boolean contains = coll.contains("Hello");
        System.out.println(contains);

        //lambda 表达式遍历
        coll.forEach(s -> System.out.println(s));
        //迭代器
        //

        /*
        * 序号	注意事项
           1	如果当前位置没有元素，还要强行获取，会报 NoSuchElementException
           2	迭代器遍历完毕，指针不会复位
           3	循环中只能用一次 next 方法
           4	迭代器遍历时，不能用集合的方法进行增加或者删除*/
        Iterator<String> iterator = coll.iterator();
        //迭代器指针不会归位0，如果需要归位0，需要重新获取迭代器，或者使用for循环
        while (iterator.hasNext()) {
            //next 获取元素 移动指针
            System.out.println(iterator.next());
        }
    }
}

