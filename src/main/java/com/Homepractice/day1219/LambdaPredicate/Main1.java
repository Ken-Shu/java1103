package com.Homepractice.day1219.LambdaPredicate;

import java.util.function.Predicate;

public class Main1 {
    public static void main(String[] args) {
        int score = 60;
        PredicatePractice p1 = (x) -> x>=60;
        PredicatePractice p2 = (x) -> x>=70;
        
        checksocre(score, p1);
        checksocre(score, p2);
        
        Predicate<Integer>bo = (x)-> x>=60;
        System.out.println(bo.test(score));
        
    }
    
    
    public static void checksocre(int score , PredicatePractice p) {
        System.out.printf("成績:%d  使否通過:%b\n",score,p);
    }
}
