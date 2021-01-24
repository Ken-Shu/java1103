package com.Homepractice.day0123;

import com.sun.istack.internal.logging.Logger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;

public class Fighting {

    Hero hero = new Hero();
    Monster monster = new Monster();
    int count = 0;
    public synchronized void monWin(MonsterAttack monsterAttack1 ,HeroAttack heroAttack1) throws InterruptedException, ExecutionException {
        while(hero.hp()>0)
            if(count%2 ==0){
                ExecutorService es = Executors.newFixedThreadPool(2);
                monsterAttack1.mth =monster.hp()-hero.atk;                               
                Future h1 = es.submit(heroAttack1);                
                h1.get();
                count++;
                es.shutdown();
            }else{
                ExecutorService es = Executors.newFixedThreadPool(2);
                heroAttack1.htm= hero.hp()-monster.atk;
                Future m1 = es.submit(monsterAttack1);
                m1.get();
                count++;
                es.shutdown();
            }
        System.out.println("WINNER");
    }
    }

   
