package com.Homepractice.day0113;

import com.ocp18_thread.Runner;

public class PracticeMain {
    public static void main(String[] args) {
        PracticeThread r1 = new PracticeThread();
        PracticeThread r2 = new PracticeThread();
        
        r1.setName("阿明");
        r2.setName("小美");
        
        r1.setPriority(Thread.MAX_PRIORITY);
        r2.setPriority(Thread.MIN_PRIORITY);
        r1.start();
        r2.start();
    }
    
}
