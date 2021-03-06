package com.Homepractice.day0123;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMain {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(new Fight());
       
            service.submit(new MonsterAttack());
            service.submit(new HeroAttack());
 
        service.shutdown(); 
    }
}
