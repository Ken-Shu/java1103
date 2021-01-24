package com.Homepractice.day0123;

import java.util.concurrent.Callable;

public class MonsterAttack implements Callable<Integer>{
Monster monster = new Monster();
Hero hero = new Hero();
int mth ;
    @Override
    public synchronized Integer call() throws Exception {
         System.out.printf("%s發動攻擊 %s遭受攻擊\n",monster.name(),hero.name());
        
        System.out.printf("%s剩餘血量:%d\n",hero.name(),mth);
    return mth;
    }    
    }
