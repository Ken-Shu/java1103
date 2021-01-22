package com.Homepractice.day1122;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadoneMain {
    public static void main(String[] args) throws Exception{
        ExecutorService exec = Executors.newFixedThreadPool(2);
        exec.submit(new Threadone());
        exec.shutdown();
        
    }
    
}
