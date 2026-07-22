package com.lryg.s20260722;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datatext {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        SimpleDateFormat sf = new SimpleDateFormat();
        String strings = sf.format(date);
        System.out.println(strings);

        SimpleDateFormat sf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String string = sf2.format(date);
        System.out.println(string);
        String str = "2023-11-11 11:11:11";
        SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date3 = sf3.parse(str);
        System.out.println(date3);
    }
}