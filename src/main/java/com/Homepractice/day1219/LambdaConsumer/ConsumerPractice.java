package com.Homepractice.day1219.LambdaConsumer;

import java.util.function.Consumer;

public class ConsumerPractice {

    public static void main(String[] args) {
        
        Consumer<String> fun = (x) -> System.out.println(x);
        fun.accept("HAHAHAHA");
    }
}
