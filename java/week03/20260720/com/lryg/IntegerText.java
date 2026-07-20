package com.lryg;

public class IntegerText {
    public static void main(String[] args) {
     /*   方法名
        方法	功能说明
public static Integer valueOf(int i)	把基本数据类型 int 变成 Integer 包装类
public int intValue()	把 Integer 包装类变回基本数据类型 int
public static int parseInt(String s)	把字符串形式的整数变成 int 基本类型
public static String toBinaryString(int i)	获取数字二进制字符串
public static String toOctalString(int i)	获取数字八进制字符串（你打错 tooctal，正确 toOctalString）
public static String toHexString(int i)	获取数字十六进制字符串*/
        System.out.println(Integer.valueOf(1)); // 把基本数据类型 int 变成 Integer 包装类
        System.out.println(Integer.parseInt("1")); // 把字符串形式的整数变成 int 基本类型
        System.out.println(Integer.valueOf("1")); // 把字符串形式的整数变成 int 基本类型
        System.out.println(Integer.toBinaryString(1)); // 获取数字二进制字符串
        System.out.println(Integer.toOctalString(1)); // 获取数字八进制字符串
        System.out.println(Integer.toHexString(1)); // 获取数字十六进制字符串
    }
}
