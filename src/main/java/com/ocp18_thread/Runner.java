package com.ocp18_thread;

//利用 繼承 Thread 來把 Runner 變成 執行緒 物件

public class Runner extends Thread{

    //執行緒 的程式進入點 就是run 方法
    @Override
    public void run() {
      //安排工作任務
        job();
    }
    
    public void job(){
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 3000; i++) {
            System.out.printf("%s 跑了 %d 公尺\n",name,i);
        }
    }
}
