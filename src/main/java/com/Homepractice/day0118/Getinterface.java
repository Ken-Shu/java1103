package com.Homepractice.day0118;

public class Getinterface implements OneforMain,TwoforMain{
    private int count = 0;

    @Override
    public int one() {
        int x = 5;
        for (int i = 0; i < x; i++) {
            System.out.println(i);
        }
        return x;
    }

    @Override
    public int two() {
       int x = 5;
        for (int i = 0; i < x; i++) {
            System.out.println(i);
        }
        return x;
    }
    
}
