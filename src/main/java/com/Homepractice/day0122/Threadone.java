package com.Homepractice.day0122;

import java.util.concurrent.Callable;

public class Threadone implements Callable<Integer>{
    private int ball = 0;
    public int buyball;

    Threadone(int x) {
        this.buyball = x;
        return;
    }
    
    
    @Override
    public Integer call() throws Exception {
        if(buyball != 0){
            ball += buyball;
        }
        return ball;
    }
    
}
