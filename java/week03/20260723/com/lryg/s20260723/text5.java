package com.lryg.s20260723;

import java.time.LocalDate;
import java.util.Calendar;

public class text5 {
    public static void main(String[] args) {
        //jdk7 判断闰年
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2000);
        calendar.set(Calendar.MONTH,2);
        calendar.set(Calendar.DATE,1);
        calendar.add(Calendar.DATE,-1);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        if (day == 29)
            System.out.println("闰年");
        else
            System.out.println("平年");

        LocalDate date = LocalDate.of(2000,3,1);
        date = date.minusDays(1);
        System.out.println(date.getDayOfMonth());
        if (date.getDayOfMonth() == 29)
            System.out.println("闰年");
        else
            System.out.println("平年");
    }
}
