package com.lrug;

import java.util.Arrays;
import java.util.stream.Stream;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
        String[] arr1={"a","b","c"};
        Arrays.stream(arr1).forEach(s-> System.out.println(s));
        Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(s-> System.out.println(s));
    }
}
