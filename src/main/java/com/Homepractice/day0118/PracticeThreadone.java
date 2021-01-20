package com.Homepractice.day0118;

import com.github.javafaker.Faker;

public class PracticeThreadone{
    public static void main(String[] args) {
         Faker faker = new Faker();
           String x=faker.name().lastName();
        Thread t1 = new MyThread(x);
        Thread t2 = new MyThread(x);
        Thread t3 = new MyThread(x);
        
       t1.setPriority(9); //優先權 1~10
       t2.setPriority(6);
       t3.setPriority(1);
        
        
        t1.start();
        t2.start();
        t3.start();
        
        
    }
    
    static class MyThread extends Thread{
        private String x ;
        
        public MyThread(String x ){
           
            this.x = x;
        }

        @Override
        public void run() {
            System.out.println("Hello I'm "+x);
        }
        
    }
}
