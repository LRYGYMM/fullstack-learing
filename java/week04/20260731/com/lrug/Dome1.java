package com.lrug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Dome1 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6","7","8","9","10");
        Stream<String> stream1 = list.stream();
        //打印一下
        stream1.forEach(System.out::println);

    }
}
