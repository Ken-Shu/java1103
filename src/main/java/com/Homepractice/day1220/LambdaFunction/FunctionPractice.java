package com.Homepractice.day1220.LambdaFunction;

import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        Function<Integer,Double>fun=(x)->x+x*3.14;
        System.out.println(fun.apply(50));
    }
    
}
