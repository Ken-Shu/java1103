package com.Homepractice.day0115;

class Student2 extends Thread {

    @Override
    public void run() {
        System.out.println("準備讀書");
        Mother2 mo = new Mother2();
        mo.start();
        try {
            mo.join(6_000);
        } catch (InterruptedException e) {
        }
        System.out.println("下樓了");
        System.out.println("準備吃飯");
    }
}

class Mother2 extends Thread {

    @Override
    public void run() {
        System.out.println("媽媽叫你5秒內下樓吃飯");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " 秒 ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("肚子不餓");
                return;
            }
        }
    }
}
    public class TestThread3 {
        public static void main(String[] args) {
            Student2 st2 = new Student2();
            st2.start();
        }
    }
