package com.Homepractice.day1219.LambdaConsumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer2 print3 =(x)->System.out.println(x);
        Consumer2 print2 = System.out::println;
                
        print3.english(500);
        print2.english(600);
        
        Consumer<String> consumer = (x)->System.out.println(x+x+x);
        consumer.accept("HA.");
    }
    
}
