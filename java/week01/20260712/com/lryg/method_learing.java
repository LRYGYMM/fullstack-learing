package com.lryg;

import java.util.Scanner;

public class method_learing {
//定义一个方法去打印99乘法表
//    public static void print99MultiplicationTable() {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        print99MultiplicationTable();
//    }
    //跳水比赛有五个评委打分，分数在0~100之间。最终得分会去掉一个最高分，去掉一个最低分
    //剩余的分数再求平均数，改平均数为选手最终得分。
    //要求1:利用键盘录入5个整数存入数组当中，如果分数超出范围需要重新录入
    //要求2:定义方法分别求数组的最大值和最小值
    //要求3:计算五名评委的总分
    //要求4:总分-最大值-最小值，求选手最终平均分
    public static int max(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
    public static int min(int[] scores) {
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }
public static void main(String[] args) {
    int[] scores = new int[5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < scores.length; i++) {
        System.out.println("请输入第" + (i + 1) + "个评委的分数：" + "（分数在0~100之间）：");
        scores[i] = sc.nextInt();
        if (scores[i] < 0 || scores[i] > 100) {
            System.out.println("输入的分数超出范围，请重新输入：");
            scores[i] = sc.nextInt(); // 重新录入分数
        }
        System.out.println("第" + (i + 1) + "个评委的分数是：" + scores[i]);
    }
    int MAX = max(scores);
    int MIN = min(scores);
    int sum =0;
    for (int i = 0; i < scores.length; i++) {
        sum += scores[i];
    }
    int finalScore = (sum - MAX - MIN) / (scores.length - 2);
    System.out.println("选手的最终得分是：" + finalScore);
}
}
