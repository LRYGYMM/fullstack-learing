package com.lryg.s03;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String message = e.toString();
            System.out.println(message);
        }
        System.out.println("hello world");
        System.err.println("hello world");
    }
}
