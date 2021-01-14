package com.Homepractice.OCA建構子;

public class Test2 {

    public static int math;
    private static int english;

    public static int sum(int math, int english) {
        int sum = 0;       
        sum += math + english;
        return sum;
    }    
    public void score(){
        System.out.println(sum(math, english));  
    }
    public void MathandEnglish(){
        System.out.println("數學"+math+"英文"+english);
    }
    public int setmath(int math){
        this.math = math;
        return math;
    }
    public int setenglish(int english){
        this.english = english;
        return english;
    }
}
