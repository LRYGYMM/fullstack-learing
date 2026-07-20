package com.lryg;

public class isPrime {
    public static void main(String[] args) {
        int number = 17;
        aa(number);
    }

    public static void aa(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + "不是质数");
                return;

            }

        }
        System.out.println(number + "是质数");

    }
}