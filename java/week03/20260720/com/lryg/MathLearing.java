package com.lryg;

import java.sql.SQLOutput;

public class MathLearing {
    public static void main(String[] args) {
        // math不可以创捷对象
        //abs获取菜蔬的绝对值
        int num1 =Math.abs(10);
        System.out.println(num1);
        //ceil向上取整
        double num2 =Math.ceil(10.1);
        System.out.println(num2);
        //floor向下取整
        double num3 =Math.floor(10.9);
        System.out.println(num3);
        //round四舍五入
        long num4 =Math.round(10.5);
        System.out.println(num4);
        //random随机数
        double num5 =Math.random();
        System.out.println(num5);
        //max获取最大值
        int num6 =Math.max(10,20);
        System.out.println(num6);
        //min获取最小值
        int num7 =Math.min(10,20);
        System.out.println(num7);
        //pow获取幂值
        double num8 =Math.pow(2,3);
        System.out.println(num8);
        //sqrt获取平方根
        double num9 =Math.sqrt(4);
        System.out.println(num9);
        //log获取自然对数
        double num10 =Math.log(2);
        System.out.println(num10);
        //exp获取指数值
        double num11 =Math.exp(2);
        System.out.println(num11);
        //sin获取正弦值
        double num12 =Math.sin(2);
        System.out.println(num12);
        //cos获取余弦值
        double num13 =Math.cos(2);
        System.out.println(num13);
        //tan获取正切值
        double num14 =Math.tan(2);
        System.out.println(num14);
        //toDegrees将弧度转换为角度
        double num15 =Math.toDegrees(2);
        System.out.println(num15);
        //toRadians将角度转换为弧度
        double num16 =Math.toRadians(2);
        System.out.println(num16);
        //cbrt 获取立方根
        double num17 =Math.cbrt(2);
        System.out.println(num17);
    }

}
