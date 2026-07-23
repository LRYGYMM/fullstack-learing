package com.lryg.s20260723;

public class searchtext1 {
    public static void main(String[] args) {
        //基本查找
        int[] array = {131, 127, 147, 81, 103, 23, 7, 79};
        int key = 103;
        System.out.println(basicSearch(array, key));
    }


    public static boolean basicSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;

    }
}
