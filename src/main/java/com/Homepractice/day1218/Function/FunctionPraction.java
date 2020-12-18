package com.Homepractice.day1218.Function;

import java.util.function.Function;

public class FunctionPraction {
    public static void main(String[] args) {
        Function<Integer , Double>fun=(x)->x*x*3.14;
        
        System.out.println(fun.apply(50));
    }
    
}
