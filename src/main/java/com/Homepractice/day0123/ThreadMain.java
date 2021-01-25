package com.Homepractice.day0123;

import java.util.concurrent.ExecutionException;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException, ExecutionException, Exception {

        Thread tex = new Thread(new Fight());
        tex.start();

        MonsterAttack ma = new MonsterAttack();
        HeroAttack ha = new HeroAttack();

        
            for (int i = 0; i <= 5; i++) {
                if (ma.hero_hp > 0 || ha.monster_hp > 0) {
                ma.call();
                ha.call();
            }else break;
        } 
                   
        }
    }



