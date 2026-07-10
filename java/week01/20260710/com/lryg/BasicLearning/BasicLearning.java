package com.lryg.BasicLearning;
//package是去定义一个包，包是类的容器
//class是去定义一个类，类是对象的模板
//hello world 是类名

import java.util.Scanner;




//{}是类的范围
public class BasicLearning {
    //public是访问修饰符，public是最大访问权限
    //static是静态的，静态的成员属于类，不属于对象
    //void是返回值类型，void表示没有返回值
    //main是方法名，是程序的入口
    //String[] args是参数，args是参数的名称，args是字符串数组
    public static void main(String[] args) {
        //输出一段文本，文本内容是HelloWorld!!
        //单行注释快捷键是ctrl + /
        /*多行注释快捷键是ctrl + shift + /*/
        System.out.println("HelloWorld!!");
        //println是输出，换行
        System.out.println(123);
        //print是输出，不换行
        System.out.print(123);
        System.out.print(56);
        System.out.println("人生不过三万天，努力加油");
        //printf是输出，格式化
        System.out.printf("今天是2023年10月10日");
        //''是字符，表示一个字符，字符是字符常量
        System.out.println('你');
        /*--------------------------------------------------------------------------------------------------------------------------*/
        //接下来是变量学习和最基础的问题解决
        /*
        * 微信余额:0元:
        支付宝余额:10元银行卡余额:20元
        问题一:请问现在一共有多少钱?
        问题二:微信收了10元红包，又发了2元红包，余额多少?*/
        double wechat = 0;
        double alipay = 10;
        double bank = 20;
        System.out.println("问题一:请问现在一共有多少钱?");
        System.out.println(wechat + alipay + bank);
        System.out.println("问题二:微信收了10元红包，又发了2元红包，余额多少?");
        wechat = wechat + 10 - 2;
        System.out.println(wechat);
//        -----------------------------------------------------------------------------------------------------------------------------
        /*定义8种数据类型的变量:
    浮点数类型:float、double
    整数类型:byte、short、int、long
    字符类型:char
    布尔类型:boolean
    变量的定义格式:
    数据类型 变量名 = 数据值;*/
        float f = 3.14f;
        System.out.println(f);
        //float类型数字后面必须加f，表示这是一个浮点型数字
        double d = 3.14;
        System.out.println(d);
        //double和float的区别是精度，double比float多占内存，所以精度更高
        byte b = 127;
        System.out.println(b);
        short s = 32767;
        System.out.println(s);
        int i = 2147483647;
        System.out.println(i);
        long l = 9223372036854775807L;
        System.out.println(l);
        //long类型数字后面必须加L，表示这是一个长整型数字
        char c = '你';
        System.out.println(c);
        boolean bo = true;
        System.out.println(bo);
        //boolean类型数字后面必须加b，表示这是一个布尔型数字
        //long是要加的
        
        //计算BMI BMI = 体重(千克)/身高(米)^2
        double weight = 70;
        double height = 1.75;
        double bmi = weight / (height * height);
        System.out.println("BMI:" + bmi);
        //计算我的升高在BMI里面最多是多少KG
        double maxWeight = bmi * height * height;
        System.out.println("我的升高在BMI里面最多是多少KG:" + maxWeight);
//        -----------------------------------------------------------------------------------------------------------------------------
        /*
        * 学习scanner，用于接收用户输入*/

        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        System.out.println(name);
        int a =sc.nextInt();
        int a2 =sc.nextInt();
        System.out.println(a + a2);
    }
}

