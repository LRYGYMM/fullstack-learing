package com.lryg.s20260723;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Live7 {
    //利用jdk7
    // 看你活了多少天
    public static void main(String[] args) throws Exception {
        String birthday = "2006-06-18";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);
        long birthTime = date.getTime();
        long liveTime = System.currentTimeMillis() - birthTime;
        System.out.println(liveTime / (1000 * 60 * 60 * 24));


        // 利用jdk8
        LocalDate ld = LocalDate.of(2006, 6, 18);
        LocalDate now = LocalDate.now();
        long liveTime1 = now.toEpochDay() - ld.toEpochDay();
        System.out.println(liveTime1);

    }
}
