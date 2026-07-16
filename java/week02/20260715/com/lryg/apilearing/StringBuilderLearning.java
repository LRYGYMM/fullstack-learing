package com.lryg.apilearing;

public class StringBuilderLearning {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
