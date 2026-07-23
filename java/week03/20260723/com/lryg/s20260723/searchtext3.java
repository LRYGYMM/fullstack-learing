package com.lryg.s20260723;

public class searchtext3 {
    public static void main(String[] args) {
        //二分查找 必须有序
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int key = 11;
        System.out.println(binarySearch(array, key));
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
