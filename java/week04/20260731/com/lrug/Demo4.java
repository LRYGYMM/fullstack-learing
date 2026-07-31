package com.lrug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","赵敏","张三丰","小昭","王五","鲁肃","李四");
        Stream<String> stream1 = list.stream();
        Stream<String> streaml = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> stream2 = stream1.filter(s -> s.length() == 3);
        stream2.forEach(System.out::println);
        list.stream().limit(6).forEach(System.out::println);
        list.stream().skip(2).forEach(System.out::println);
    }
}
