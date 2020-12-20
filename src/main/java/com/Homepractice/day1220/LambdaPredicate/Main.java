package com.Homepractice.day1220.LambdaPredicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        int score = 60;
        Math math = (x)-> x>=60;
        Math math2 =(x )-> x>=80;
        print(score, math);
        print(score, math2);
        
        
        Predicate<Integer>pre = (x)->x<=80;
        Predicate<Integer>pre2 = (x)->x<=50;
        System.out.printf("得到%d分 是否及格%b\n",score,pre.test(score));
        System.out.printf("得到%d分 是否及格%b\n",score,pre.test(score));
        
        
    }
    public static void print(int score , Math m) {
        System.out.printf("得到%d分 是否及格%b\n",score,m);
    }
}
