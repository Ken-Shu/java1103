package com.Homepractice.day0118;

public class Withdraw implements Runnable{
    private Accound accound;
    private int x ;

    public Withdraw(Accound accound, int x) {
        this.accound = accound;
        this.x = x;
    }

    @Override
    public void run() {
        accound.withdraw(x);
    }
    
    
}
