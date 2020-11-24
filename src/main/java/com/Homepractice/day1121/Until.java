package com.Homepractice.day1121;

import com.sun.org.apache.xpath.internal.functions.FuncNumber;

public class Until {

    public int number;
    private int english;
    private int math;

    void number(int number1) {
        int []x = new int[number1];
        number = number1;

        System.out.printf("學號:%d", number);
    }
    void english2 (int english){
        int english1 = 0;
        
        english1+=english;
        
        System.out.printf("英文:%d ",english1);
    }
    void math2 (int math){
        int math1 = 0;
        math1 +=math;
        System.out.printf("數學:%d\n",math1);
    }
    void sum(int number,int english1,int math1){
        int sum = 0;
        english =english1;
        math =math1;
        sum = english1+math1;
        System.out.printf("總分:%d\n",sum);
    }
}
