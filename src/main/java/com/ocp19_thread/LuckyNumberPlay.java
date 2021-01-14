package com.ocp19_thread;

public class LuckyNumberPlay {
    public static void main(String[] args) {
        LuckyNumber l1 = new LuckyNumber();
        LuckyNumber l2 = new LuckyNumber();
        l1.setName("小明");
        l2.setName("小華");
        l1.start();
        l2.start();
        
        LuckyNumber2 l3 = new LuckyNumber2();
        LuckyNumber2 l4 = new LuckyNumber2();
        l3.setName("小明2號");
        l4.setName("小華2號");
        l3.start();
        l4.start();
    }
    
}
