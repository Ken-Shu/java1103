package com.Homepractice.day1221.Lamda.Consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Math p1 = System.out::println;
        Math p2 =System.out::println;
        
        p1.math(50);
        p2.math(60);
        
        Consumer<String>con = (x)->System.out.println(x+x+x+x);
        con.accept("Ha.");
    }
    
}
