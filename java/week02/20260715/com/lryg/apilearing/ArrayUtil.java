package com.lryg.apilearing;

public class ArrayUtil {



    public static String arrayToString(int[] arr) {
            if(arr == null){
                return "null";
            }

        // 1.创建StringBuilder容器对象，并添加左括号[
        StringBuilder sb = new StringBuilder("[");

        // 2. 遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                // 最后一个元素，不加逗号，拼接右括号
                sb.append(arr[i]);
                sb.append("]");
            } else {
                // 不是最后一个元素，元素后面拼接逗号空格
                sb.append(arr[i]);
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
