package com.lryg.apilearing;

public class add {
    public static void main(String[] args) {
        String a = "1234";
        String b = "12352";
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();

        // 指针：各自数组最后一位下标
        int i = c.length - 1;
        int j = d.length - 1;
        int carry = 0; // 进位（对应你代码里的num）
        // 结果先放StringBuilder（逆序存放）
        StringBuilder sb = new StringBuilder();

        // 条件：还有数字没遍历完 或者 还有进位
        while (i >= 0 || j >= 0 || carry > 0) {
            // 指针>=0取数字，否则补0
            int num1 = i >= 0 ? c[i] - '0' : 0;
            int num2 = j >= 0 ? d[j] - '0' : 0;

            int sum = num1 + num2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);

            // 指针向前移动
            i--;
            j--;
        }
        // 现在数据是反向的，反转
        String result = sb.reverse().toString();
        System.out.println(result); // 13586
    }
}