package com.ocp25_threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JobMain {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.submit(new ShortJob());
        service.submit(new ShortJob());
        service.submit(new Job());
        service.submit(new LongJob());
        service.submit(new ShortJob());
        
        service.shutdown();
        System.out.println("shutdown....");
        
        //監測執行緒池 執行的任務狀況
        System.out.println("監測:");
        while (!service.awaitTermination(1, TimeUnit.SECONDS)) { //每隔 1 秒 監測 ( 1 , SECONDS)
            System.out.println("還有執行緒在執行任務" + Thread.activeCount());            
        } //Thread.activeCount 可以知道還有幾個執行緒在執行中
        System.out.println("close....所有工作都已經執行完畢");
    }
    
}
