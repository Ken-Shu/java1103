package com.Homepractice.day1220.LambdaComsumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Math print =(x)->System.out.println(x);
        Math print2 =System.out::print;
        
        print.math(50);
        print2.math(600);
        System.out.println("");
        Consumer<String>con=(x)->System.out.println(x+x+x);
        con.accept("HA");
    }
    
}
