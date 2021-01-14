package com.ocp18_thread;

public class RunnerMain {
    public static void main(String[] args) {
        Runner r1 = new Runner();       
        Runner r2 = new Runner();
        r1.setName("烏龜");
        r2.setName("兔子");
        
        //Daemon 背景執行緒 設定true 或 false 就是背景執行緒 沒設定就是主執行緒(User)
        r2.setDaemon(true); //代表兔子只是陪跑 烏龜跑完程式即停止
        
        // Priority 權限 此處為 讓 r1 的權限 > r2
        //r1.setPriority(Thread.MAX_PRIORITY); // 1~10
        //r2.setPriority(Thread.MIN_PRIORITY); // 1~10
        r1.start(); //啟動執行緒
        r2.start(); //啟動執行緒
    }
}
