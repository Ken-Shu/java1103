package com.ocp19_thread;

public class LuckyNumber2 extends Thread{
    private static final int LUCKY_NUMBER =777;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; true ; i++) {
            int number = (int)(Math.random()*1000); //Math.random 是 介於 0~<1的浮點數
            if(number == LUCKY_NUMBER){
                System.out.printf("%s 總共取了 %d 次 取到%d \n",name,i,LUCKY_NUMBER);
                break;
            }
        }
    }
    
}
