package com.lryg.s20260802;

import java.util.ArrayList;
import java.util.Arrays;

public class waytest {
    public static void main(String[] args) {
        Integer[] arr = {5,4,6,3,2};
        Arrays.sort(arr,waytest::dub);
        for (Integer i:arr) {
            System.out.println(i);
        }
    }
    public static int dub(int num1,int num2){
        return num1-num2;
    }
}
