package com.Homepractice.day1219.LambdaFunction;

import java.util.function.Function;

public class Math2 {
    public static void main(String[] args) {
        Function<Integer,Double>fun=(x)->x*x*3.14;
        System.out.println(fun.apply(5));
    }
    
}
