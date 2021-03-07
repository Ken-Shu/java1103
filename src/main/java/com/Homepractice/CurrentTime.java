
package com.Homepractice;

public class CurrentTime {
    public static void main(String[] args) throws Exception{
        long startTime = System.currentTimeMillis(); //獲取開始時間
        System.out.println("Star");
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }  
        long endTime = System.currentTimeMillis(); //獲取結束時間
        System.out.println("startTime"+startTime);
        System.out.println("endTime"+endTime);
        System.out.println("程式執行時間：" +(endTime - startTime) + "ms"); //輸出程式執行時間    
    }

}
