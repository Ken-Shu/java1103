package com.ocp23_cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class ReturnHone {
    public static void main(String[] args) {
        int n = 3;
        Runnable lunch = ()-> System.out.println("吃午餐~");
        CyclicBarrier cb = new CyclicBarrier(n,lunch);
        for (int i = 1; i <= 3; i++) {
            //Thread t = new  Thread(new Car(cb),i+"號車");
            Car car = new Car(cb);
            car.setName(i+"號車");
            
            car.start();
        }
    }
    
}
