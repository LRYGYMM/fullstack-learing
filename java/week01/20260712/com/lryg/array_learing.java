package com.lryg;

import java.util.Random;
import java.util.Scanner;

public class array_learing {
    public static void main(String[] args) {
//        int []year = new int[]{1,2,3,4,6};
//        for(int i = 0; i < year.length; i++)
//            System.out.println(year[i]);
//        int []array =new int[6];
//        Scanner sc = new Scanner(System.in);
//        for(int i=0;i<array.length;i++){
//            System.out.println("Enter the elements of the array:");
//            int num =sc.nextInt();
//            array[i]=num;
//
//        }
//        System.out.println("The elements of the array are:");
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
//        int []array = new int[]{1,2,3,4,5,6,2,1,3};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number you want to find:");
//        int num = sc.nextInt();
//        boolean found = false;
//        for(int i=0;i<array.length;i++) {
//            if (array[i] == num) {
//                System.out.println("你要寻找的数字在数组的第 " + i);
//                found = true;
//                break;//如果找到了 循环直接结束，不再继续循环
//            }
//        }
//            if(!found){
//                System.out.println("没有找到");
//            }
        int []array = new int[10];
        Random r = new Random();

        for (int i =0 ; i<array.length;){
            int num = r.nextInt(100)+1;
            boolean found = false;
            for (int j=0 ; j<i;j++) {
                if (array[j] == num) {
                    found = true;
                    break;
                }


            }
            if (!found) {
                array[i] = num;
                System.out.print(array[i] + " ");
                i++;
            }

        }


    }
}
