package com.Homepractice.day1218;

public class Main {
    public static void main(String[] args) {
        Lambda1 math = (int x , int y) -> x+y;
        Lambda1 math2 = (x , y )-> {return x*y;};
        System.out.println(math.math(10, 20));
        System.out.println(math2.math(20, 20));
    }
    
}
