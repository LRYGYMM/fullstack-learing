package com.lryg.s20260722;

public class RegexDome1 {
    public static void main(String[] args) {
        String qq ="1234567790";
        System.out.println(isQQ(qq));
        System.out.println(qq.matches("[1-9]\\d{5,19}"));

    }

    public static boolean isQQ(String qq){
        int len=qq.length();
        if(len<6||len>20){
            return false;
        }
        if (qq.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c<'0' || c>'9') {
                return false;
            }
        }
        return true;

    }
}
