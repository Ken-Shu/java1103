package com.Homepractice.day1219.LambdaConsumer;

import java.util.function.Consumer;

public class Main1 {
    public static void main(String[] args) {
        Consumer4 print = (x)->System.out.println(x);
        
        print.school2(500);
        
        Consumer<String> fun = (x)->System.out.println(x+x);
        fun.accept("HAHAHA");
    }
    
}
