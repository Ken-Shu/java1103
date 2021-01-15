package com.Homepractice.day0115;


class Mother extends Thread{

    @Override
    public void run() {
        System.out.println("媽媽準備煮飯");
        System.out.println("媽媽叫瓦斯");
        Worker worker = new Worker();
        worker.start();
        try {
            worker.join(7_000);
        } catch (Exception e) {
        }
        System.out.println("媽媽開始煮飯");
    }
    
    
    class Worker extends Thread{

        @Override
        public void run() {
            System.out.println("送瓦斯中...");
            for (int i = 0; i <= 5; i++) {
                System.out.print(i+" 秒 ");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("瓦斯工人發生意外");
                    return;
                }
            }
            System.out.println();
            System.out.println("工人將瓦斯送到");
        }
        
    }
}

public class TestThread1 {
    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.start();
    }
    
}
