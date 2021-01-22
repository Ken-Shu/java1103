package com.Homepractice.day0122;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadMain {
    public static void main(String[] args) throws Exception {
       int x= 5;
       Threadone threadone = new Threadone(x);
        ExecutorService es = Executors.newFixedThreadPool(2);
       Future fu = es.submit(threadone);
       Object f1 = fu.get();
        System.out.println(f1);
        es.shutdown();
    }
    
}
