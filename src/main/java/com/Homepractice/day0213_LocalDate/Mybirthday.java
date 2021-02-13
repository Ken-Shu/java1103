package com.Homepractice.day0213_LocalDate;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Mybirthday {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1994, 01, 12);
        LocalDate today = LocalDate.now();
        System.out.println("today:"+today);
        long days = ChronoUnit.DAYS.between(today, birthday);//取的相差的天數
        long year = days/365;
        System.out.println("There are"+year+"days until Xmas");
       
        //用來比較兩個之間相差的 年 月 日
        Period untilXMas = Period.between(birthday, today);
        
        System.out.println("There are "+untilXMas.getYears()+" Years "+untilXMas.getMonths()+" Month and "+untilXMas.getDays()+" Days ");
        
       
    }
    
}
