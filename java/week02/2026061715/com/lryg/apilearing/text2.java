package com.lryg.apilearing;

import java.util.Scanner;

public class text2 {
    public static void main(String[] args) {
        String st ="大展宏图abc12";
        char c = st.charAt(3);
        System.out.println(c);


        int len = st.length();
        System.out.println(len);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        System.out.println("字符串的长度是："+str.length());
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
