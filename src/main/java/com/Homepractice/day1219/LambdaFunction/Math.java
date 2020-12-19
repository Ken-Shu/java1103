package com.Homepractice.day1219.LambdaFunction;

import java.util.function.Function;

public class Math {
    public static void main(String[] args) {
        Function<Integer , Integer> fun = (x)->x+x;
        System.out.println(fun.apply(50));
    }
    
}
