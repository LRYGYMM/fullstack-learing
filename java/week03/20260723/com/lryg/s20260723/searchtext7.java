package com.lryg.s20260723;

public class searchtext7 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        //遍历打印最终结果
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void quickSort(int[] arr, int i, int j) {
        // 递归终止条件：左边界>=右边界，区间无需排序
        if (i >= j) {
            return;
        }
        int start = i;
        int end = j;
        int baseNumber = arr[i]; // 选最左边为基准

        while (start != end) {
            // 1. end 从后往前：找 小于基准 的数
            while (arr[end] >= baseNumber && end > start) {
                end--;
            }
            // 2. start 从前往后：找 大于基准 的数
            while (arr[start] <= baseNumber && end > start) {
                start++;
            }
            // 左右指针没相遇，交换两个元素
            if (start != end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        // start和end重合，基准归位
        arr[i] = arr[start];
        arr[start] = baseNumber;

        // 递归处理左半边、右半边
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}