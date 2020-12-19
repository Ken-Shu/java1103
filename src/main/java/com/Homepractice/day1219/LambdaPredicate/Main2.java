package com.Homepractice.day1219.LambdaPredicate;

import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        int socore = 80;
        PredicatePractice2 p1 = (x)-> x>=60;
        PredicatePractice2 p2 = (x) -> x<=40;
        
        checkscore(socore, p2);
        checkscore(socore, p1);
        
        
        Predicate<Integer> bo = (x)-> x>=60;
        System.out.println(bo.test(socore));
    }
    public static void checkscore(int score , PredicatePractice2 p) {
        System.out.printf("%d分 成績:%b\n",score,p);
    }
}
