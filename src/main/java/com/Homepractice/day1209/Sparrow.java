package com.Homepractice.day1209;

public class Sparrow extends Bird{

    public Sparrow(String name, int foot) {
        super(name, foot);
    }

    public Sparrow(String move) {
        super(move);
        System.out.println(move);
    }
               
}
