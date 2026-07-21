package com.lryg.s20260721;

import java.math.BigInteger;

public class BigintegerTest1 {
    public static void main(String[] args) {
        //利用构造方法获取对象
        //每一次创建都是新的对象
        BigInteger b1 = new BigInteger("1");
        BigInteger b2 = new BigInteger("1");
        //获取的是对象的地址
        System.out.println(b1==b2);
        //利用静态方法获取对象
        //当biginteger加载到内存的时候 会把-16到16的integer对象加载到内存中 一共33个对象 放入到数组中
        //目的是节约内存
        BigInteger b3 = BigInteger.valueOf(17);
        BigInteger b4 = BigInteger.valueOf(17);
        System.out.println(b4==b3);
        //超过long的取值范围
        BigInteger b5 = new BigInteger("123456789012345678901234567890");
        System.out.println(b5);
        //直接赋值 是不会创建对象的
        //BigInteger b6 = 123;
    }
}
