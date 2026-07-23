package com.lryg.s20260723;

public class searchtext6 {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 19, 50, 48};
        int startindex = arr.length; // 默认全部无序

        // 找到连续升序的截止位置
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                startindex = i + 1;
                break;
            }
        }

        // 后半段插入排序，补齐大括号，修正边界
        for (int i = startindex; i < arr.length; i++) {
            int j = i;
            int temp;
            // 必须加{}包裹全部交换、j--代码
            while (j > 0 && arr[j] < arr[j - 1]) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        // 遍历打印结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}