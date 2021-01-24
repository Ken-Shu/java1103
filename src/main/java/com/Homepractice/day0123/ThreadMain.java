package com.Homepractice.day0123;

import java.util.concurrent.ExecutionException;



public class ThreadMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
         
        Thread tex = new Thread(new Fight());
        tex.start();
        
        
        
        MonsterAttack ma = new MonsterAttack();
        HeroAttack ha = new HeroAttack();
       Fighting fi = new Fighting();
       fi.monWin(ma, ha);
    }
    
}
