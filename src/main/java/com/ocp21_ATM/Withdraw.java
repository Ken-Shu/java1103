package com.ocp21_ATM;

//提款執行緒(工作)
public class Withdraw implements Runnable{
    private Accound accound;
    private int x;

    public Withdraw(Accound accound, int x) {
        this.accound = accound;
        this.x = x;
    }

    @Override
    public void run() {
        //去執行提款的邏輯
       accound.withdraw(x);
    }
    
}
