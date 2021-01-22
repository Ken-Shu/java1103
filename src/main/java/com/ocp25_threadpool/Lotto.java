package com.ocp25_threadpool;

import java.util.Random;


public class Lotto implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        System.out.println(new Random().nextInt(100));
    }
    
}
