package com.lryg.sday2;

public class ArgsDemo2 {
    public static void main(String[] args) {
        int sum = 0;
        int [] arr = {1,2,3,4,5,6,7};
        sum = getSum(arr);
        System.out.println(sum);


    }
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
