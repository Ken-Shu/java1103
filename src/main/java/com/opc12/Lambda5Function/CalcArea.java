package com.opc12.Lambda5Function;

import java.util.function.Function;

public class CalcArea {
    public static void main(String[] args) {
        Function<Integer , Double>func = (x)->x*x*3.14;
        System.out.println(func.apply(10));
        //func = 我丟進去一個x 會的到 x*x*3.14的值
        //傳進去Integer 得到Double的值
        //Fumction 用 apply 回傳
    }
    
}
