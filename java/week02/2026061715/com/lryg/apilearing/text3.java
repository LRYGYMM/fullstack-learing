package com.lryg.apilearing;

import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        int daxiecount = 0;
        int xiaoxiecount = 0;
        int mumercount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                daxiecount++;
            } else if (c >= 'a' && c <= 'z') {
                xiaoxiecount++;
            } else if (c >= '0' && c <= '9') {
                mumercount++;
            }
        }
        System.out.println("大写字母个数为：" + daxiecount);
        System.out.println("小写字母个数为：" + xiaoxiecount);
        System.out.println("数字个数为：" + mumercount);
    }
}
