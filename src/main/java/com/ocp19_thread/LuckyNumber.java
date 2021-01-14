package com.ocp19_thread;

public class LuckyNumber extends Thread {
    
    private static final int LUCKY_NUMBER = 777;

    @Override
    public void run() {
        job();
    }

    public void job() {
        String name = Thread.currentThread().getName();
        int count = 0;
        while (true) {
            int x = (int) (Math.random() * 1000);
            if (x != 777) {
                count++;
            } else {
                break;
            };
        }
        System.out.printf("姓名:%s 共取了%d才得到%d\n", name, count,LUCKY_NUMBER);
    }
}
