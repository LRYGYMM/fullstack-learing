package com.lryg;

public class ArryUntil {
    private ArryUntil() {}
/*//  public static void PrintArr(int[] arr){
//        System.out.print("[");
//        for(int i = 0; i < arr.length; i++){
//            if(i == arr.length - 1)
//                System.out.print(arr[i]+"]");
//            else
//                System.out.print(arr[i] + ", ");
//        }
//    }*/
    public static String PrintArr(int[] arr) {
        String res = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                res = res + arr[i] + "]";
            else
                res = res + arr[i] + ", ";
        }
        return res;
    }
}

