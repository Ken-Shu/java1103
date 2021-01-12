
package com.Homepractice.day0113;

public class PracticeThread extends Thread{
    
    public void run(){
       km();
    }
    
    public void km(){
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s 跑了 %d \n",name,i);
        }
    }
}
