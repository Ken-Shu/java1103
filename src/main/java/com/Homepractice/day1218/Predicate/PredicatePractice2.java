package com.Homepractice.day1218.Predicate;

import java.util.function.Predicate;

public class PredicatePractice2 {
    public static void main(String[] args) {
        int score = 60;
        Predicate<Integer>pass = (x) -> x>=50;
        System.out.printf("是否通過考試:%b\n",pass.test(score));
        
    }
    
}
