package com.lryg.s20260723;

import java.util.ArrayList;

public class searchtext2 {
    public static void main(String[] args) {
        int[] array = {131, 127, 147, 81, 103, 23, 7, 81, 79};
        int key = 81;
        System.out.println(basicSearch(array, key));
    }

    public static ArrayList<Integer> basicSearch(int[] array, int key) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                list.add(i);
            }
        }
        return list;
    }
}
