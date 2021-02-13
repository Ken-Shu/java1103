
package com.Homepractice.day0213_LocalDate;

import java.time.LocalDate;
import java.time.Period;


public class PeriodDemo {
public static void demo2(){
    LocalDate today = LocalDate.now();
    LocalDate d1 =LocalDate.now();
    d1=plusDay(d1);
    System.out.println("d1:"+d1);
    
    //從原本的時間 再加上時間
    LocalDate d2 = LocalDate.now();
    d2 = plusDayByPeriod(today , Period.ofMonths(5));
    d2 = plusDayByPeriod(d2 , Period.ofDays(5));
    d2 = plusDayByPeriod(d2 , Period.ofWeeks(5));
    d2 = plusDayByPeriod(d2 , Period.ofYears(5));
    System.out.println(d2);
}
private static LocalDate plusDay(LocalDate d){
    d = d.plusMonths(1).plusDays(1).plusWeeks(1).plusYears(1);
    return d;
}
//使用多型
private static LocalDate plusDayByPeriod(LocalDate d ,Period p){
    d = d.plus(p);
    return d;
}
    public static void main(String[] args) {
        demo2();
    }
}
