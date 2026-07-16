package com.lryg.apilearing;

public class StringLearing {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str);
        String s = new String();
        System.out.println("--"+s+"@@");
        String s2 = new String(str);
        System.out.println(s2);
        char[] a = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String s3 = new String(a);
        System.out.println(s3);
        byte[] b = {97, 98, 99, 100, 101};//字节类型数组，会转换成对应的字符数组
        String s4 = new String(b);
        System.out.println(s4);

    }
}
