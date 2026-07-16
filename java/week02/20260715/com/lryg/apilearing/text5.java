package com.lryg.apilearing;

import java.util.Scanner;

public class text5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        String str = sc.next();
        int Lastline = str.length() % 8;
        int count = 8 - Lastline;
        if (count != 0) {
            String num = "00000000".substring(0, count);
            str += num;
        }
        for (int i = 0; i < str.length(); i += 8) {
            String s = str.substring(i, i + 8);
            System.out.println(s);
        }
    }
}

