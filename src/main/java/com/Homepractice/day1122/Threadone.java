package com.Homepractice.day1122;

public class Threadone implements Runnable{

    @Override
    public void run() {
        int n = 100;
        int x = 0;
        try {
            if (n >= x) {
                //throw new ArithmeticException();
            //}else{
                System.out.println("相等");
            }
        } catch (Exception e) {
            System.out.println("拋出例外");
        }
        finally{
            System.out.println("結束");
        }
    }        
    }
    
