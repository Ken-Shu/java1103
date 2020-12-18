package com.Homepractice.day1218.Consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ConsumerPratice print = (x)->System.out.println(x);
        ConsumerPratice print1 = (y)->System.out.println(y);
        
        print.math(500);
        print1.math(500);
        
        Consumer<String>consumer =(x)->System.out.println(x+x);
        Consumer<String>consumer1 = (y)->System.out.println(y+y+y); 
        consumer.accept("Ha");
        consumer1.accept("HAHAHAHA..");
    }
}
