package com.Homepractice.day0118;

public class ATM {
    public static void main(String[] args) {
        Accound accound = new Accound(10_0000);
        Withdraw w1 = new Withdraw(accound, 5_0000);
        Withdraw w2 = new Withdraw(accound, 3_0000);
        Withdraw w3 = new Withdraw(accound, 4_0000);
        
        Thread t1 = new Thread(w1, "小花");
        Thread t2 = new Thread(w2, "小狗");
        Thread t3 = new Thread(w3, "小明");
        t1.start();
        t2.start();
        t3.start();
    }
}
