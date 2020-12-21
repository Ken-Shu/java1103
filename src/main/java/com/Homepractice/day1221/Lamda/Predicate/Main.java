package com.Homepractice.day1221.Lamda.Predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        int score = 60;
        
        Math p1 = (x)-> x>=40;
        Math p2 = (x)-> x>=80;
        
        print(score, p2);
        print(score, p1);
        
        Predicate<Integer>pre = (x)-> x>=50;
        System.out.println(pre.test(score));
        Predicate<Integer>pre2=(x)-> x>=30;
        System.out.println(pre2.test(score));
    }
    public static void print(int score , Math m) {
        System.out.printf("得到%d分 是否通過:%b\n",score,m);
        
    }
}
