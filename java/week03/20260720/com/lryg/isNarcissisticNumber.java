package com.lryg;

import java.util.Scanner;

public class isNarcissisticNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = scanner.nextInt();
        int sum=0;
        int temp=number;
        String len = number+"";
        while (number != 0){
            int lastmuber=number%10;
            number =number /10;
            sum=(int)(sum+Math.pow(lastmuber,len.length()));
        }
        if (sum == temp){
            System.out.println(temp+"是自幂数");
        }else {
            System.out.println(temp+"不是自幂数");
        }
    }
}
