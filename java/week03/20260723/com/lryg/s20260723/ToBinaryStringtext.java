package com.lryg.s20260723;

public class ToBinaryStringtext {
    public static void main(String[] args) {
        System.out.println(toBinaryString(10));
        System.out.println(Integer.toBinaryString(10));

    }
    public static String toBinaryString(int i) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.insert(0, i % 2);

            i /= 2;

            if (i == 0) {
                break;
            }
        }
        return sb.toString();
    }
}
