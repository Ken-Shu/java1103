package com.Homepractice.day1219.LambdaConsumer;

import java.util.function.Consumer;

public class School1 {
    public static void main(String[] args) {
        Consumer3 print = (x)->System.out.println(x);
        Consumer3 print1 = System.out::println;
        
        print.school(500);
        print1.school(600);
        
        Consumer<String> fun = (x)->System.out.println(x+x+x);
        fun.accept("POO");
    }
    
}
