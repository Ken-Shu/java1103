package com.Homepractice.day1220.LambdaPredicate;

import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        int score = 50;
        PredicatePractice2 p1 = (x)->x>=60;
        PredicatePractice2 p2 = (x)-> x>=40;
        
        print(score, p2);
        print(score, p1);
        
        Predicate<Integer>pre = (x)-> x>=60;
        System.out.printf("得到%d分  是否及格:%b\n",score,pre.test(score));
    }
    public static void print(int score,PredicatePractice2 p) {
        System.out.printf("得到%d分  是否及格:%b\n",score,p);
    }
}
