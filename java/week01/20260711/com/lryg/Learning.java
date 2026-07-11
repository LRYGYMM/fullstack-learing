package com.lryg;

import java.util.Random;
import java.util.Scanner;

public class Learning {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the radius of the circle:");
//        double r = sc.nextDouble();
//        System.out.println("The area of the circle is: "+r*r*3.14);
//        ---------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入多少秒");
//        int seconds = sc.nextInt();
//        int hour = seconds / 3600;
//        int minute = (seconds % 3600) / 60;
//        int second = seconds % 60;
//        System.out.println(hour + ":" + minute + ":" + second);
//        -------------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你的成绩");
//        int score = sc.nextInt();
//        if (score > 90){
//            System.out.println("优秀");
//        }
//        else if (score > 80){
//            System.out.println("良好");
//        }
//        else if (score > 70){
//            System.out.println("中等");
//        }
//        else if (score > 60){
//            System.out.println("及格");
//        }
//        else {
//            System.out.println("不及格");
//        }
//        -------------------------------------------------------------------
//        for(int i = 1; i<10 ; i++ ){
//            for(int j = 1; j<i ; j++){
//                System.out.print(j+"*"+i+"="+(j*i)+"\t");
//
//            }
//            System.out.println();
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("今天周几");
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("星期一");
//            case 2 -> System.out.println("星期二");
//            case 3 -> System.out.println("星期三");
//            case 4 -> System.out.println("星期四");
//            case 5 -> System.out.println("星期五");
//            case 6 -> System.out.println("星期六");
//            case 7 -> System.out.println("星期日");
//            default -> System.out.println("输入错误");
//        }
//        int a =0;
//        int b =1;
//        int c;
//        for(int i = 0; i < 10; i++){
//            System.out.println(a);
//            c = a + b;
//            a = b;
//            b = c;
//        }
//        -------------------------------------------------------------------
//        int signal = 1;
//        int result = 0;
//        for(int i = 1; i <= 4; i++){
//            if(i%2==0){
//                signal = -1;
//                result += signal*i;
//            }
//            else {
//                signal = 1;
//                result += signal*i;
//            }
//        }
//        System.out.println(result);
        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int nums = r.nextInt(1,101);
        int num = sc.nextInt();
        while (num != nums) {
            System.out.println("数字");

            if (num > nums) {
                System.out.println("太大了");
                num = sc.nextInt();
            }
            if (num < nums) {
                System.out.println("太小了");
                num = sc.nextInt();
            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }
}
