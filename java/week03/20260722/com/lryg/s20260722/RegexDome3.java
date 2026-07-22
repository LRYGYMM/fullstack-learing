package com.lryg.s20260722;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDome3 {
    public static void main(String[] args) {
        String str = "我要学学编编编编编程程";
        String result = str.replaceAll("(.)\\1+","$1");
        System.out.println(result);
        Pattern p = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        Matcher m = p.matcher("2026-07-22");
        if(m.find()){
            System.out.println(m.group(1)); //2026
            System.out.println(m.group(2)); //07
        }


    }
}
