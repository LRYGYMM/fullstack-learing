package com.lryg.s20260725;

public class fanxing {
        public static void main(String[] args) {
            text1 opt = new text1();
            opt.add("Java");
            opt.add("MySQL");
            System.out.println(opt.get(0));
            opt.remove("Java");
            System.out.println(opt.get(0));
        }
    }