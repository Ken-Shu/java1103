package com.Homepractice.day1202;

public class Ostrich extends Bird{

    public Ostrich() {
    }

    public Ostrich(String name, int foot, String move) {
        super(name, foot, move);
    }
    public void move(){
        System.out.println("走");
    }
}
