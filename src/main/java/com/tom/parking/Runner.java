package com.tom.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String enterTime = "08:27";
        String exitTime = "13:05";
        SimpleDateFormat sdf =
                new SimpleDateFormat("HH:mm");
        //Exception 例外 vs Error 錯誤
        //Exception handling 例外處理
        Date d = null;
        try {
            d = sdf.parse(enterTime);
        } catch (Exception e) {
            System.out.println("Wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        //
//        long a = 3*60*60*1000;
        try {
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            long ms = d2.getTime() - d.getTime();
            int minutes = (int)(ms/(1000*60));
            System.out.println(minutes);
        } catch (Exception e) {
            System.out.println("Exit wrong format");
        }
//        d2.setTime(d.getTime()+a);

    }
}
