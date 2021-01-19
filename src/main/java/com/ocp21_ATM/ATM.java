package com.ocp21_ATM;

public class ATM {
    public static void main(String[] args) {
        Accound accound = new Accound(10_0000);
        // 帳號(資源)
        Withdraw w1 = new Withdraw(accound, 5_0000); // 1號人員提5萬
        Withdraw w2 = new Withdraw(accound, 3_0000); // 2號人員提3萬
        Withdraw w3 = new Withdraw(accound, 4_0000); // 3號人員提4萬
        //分配任務
        Thread t1 =new Thread(w1, "小明");
        Thread t2 =new Thread(w2, "小華");
        Thread t3 =new Thread(w3, "小花");
        t1.start();
        t2.start();
        t3.start();
        
        
    }
}
