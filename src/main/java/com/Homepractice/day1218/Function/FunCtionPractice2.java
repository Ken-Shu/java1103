package com.Homepractice.day1218.Function;

import java.util.function.Function;


public class FunCtionPractice2 {
    public static void main(String[] args) {
        Function<Integer , Integer>func = (x)->(x+x);
        System.out.println(func.apply(100));
    }
}
