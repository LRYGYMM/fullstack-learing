package com.lryg;

public class Systemtext {
    public static void main(String[] args) {
       /* System.out.println("Hello, World!");
        System.exit(0);
        System.out.println("Hello, World!");*/

        //获取当前时间
        /*long a= System.currentTimeMillis();
        System.out.println(a);
        long b= System.currentTimeMillis();
        System.out.println(b-a);*/

        int[] a={1,2,3,4,5,6,7,8,9,10};
        int[]b=new int[10];
        System.arraycopy(a,4,b,3,4);
        for(int i=0;i<10;i++){
            System.out.println(b[i]);
        }
    }
}
