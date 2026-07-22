package com.lryg.s20260722;

public class RegexDome2 {
    public static void main(String[] args) {
        //手机号码的格式
        String regex1="1[3-9]\\d{9}";
        System.out.println("13800138000".matches(regex1));
        System.out.println("13800138001".matches(regex1));

        String regex2="0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("0571-1234567".matches(regex2));
        String regex3="\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("1234567890@qq.com".matches(regex3));
        System.out.println("1234567890@qq.com.cn".matches(regex3));
    }
}
