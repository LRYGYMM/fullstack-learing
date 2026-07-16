package com.lryg.apilearing;

public class ComrareString {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String st4 = "Hello";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(st4));
        System.out.println(str1.equalsIgnoreCase(st4));
    }
}
