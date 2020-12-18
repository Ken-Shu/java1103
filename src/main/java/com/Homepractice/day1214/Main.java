package com.Homepractice.day1214;

public class Main {
    public static void main(String[] args) {
        Man ma = new Man();
        Zoo zo1 = ma.getbird();
        ma.printFoot(zo1);
        System.out.println(ma.birdName(zo1));
        ma.eat(zo1);
    }
    
}
