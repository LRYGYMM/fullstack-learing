package com.lryg.sday2;

public class ArgsDemo3 {
    public static void main(String[] args) {
        //可变参数
        getSum(1,2,3,4,5,6,7);
        System.out.println("sum:"+getSum(1,2,3,4,5,6,7));
    }
    public static int getSum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
