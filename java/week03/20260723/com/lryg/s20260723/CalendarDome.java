package com.lryg.s20260723;

import java.util.Calendar;
import java.util.Date;

public class CalendarDome {
    public static void main(String[] args) {
        //获取日历对象
        //会把时间中的纪元 年 月 日 是 分 秒 等获取出来 放到一共数组中
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);
        int year =c.get(1);
        System.out.println(year);
        int month =c.get(2)+1;
        System.out.println(month);
        int day =c.get(5);
        System.out.println(day);
    }
}
