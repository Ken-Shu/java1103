package com.Homepractice.day0123;

import java.util.concurrent.Executor;

public class ThreadExcutor implements Executor{

    @Override
    public void execute(Runnable command) {
        Thread t = new Thread(command);
        t.start();
    }
    
}
