package com.Homepractice.day1218.Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicatePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        Pass schoolPass=(x)-> x>=60;
        Pass JavaPass=(x)-> x>=75;
        
        checkscore(score, JavaPass);
        
        Predicate<Integer>pass=(x)->x>=60;
        System.out.println(pass.test(score));
        Predicate<Double>pass2=(x)-> x>=60 && x<=100;
        System.out.println(pass2.test((double)score));
    }
   
    
    public static void checkscore(int x ,Pass p) {
        System.out.printf("成績:%d 是否通過:%s\n",x,p.check(x));
    }
}
