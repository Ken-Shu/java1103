package com.Homepractice.day0123;

import java.util.concurrent.Callable;

public class HeroAttack implements Callable<Integer>{
Monster monster = new Monster();
Hero hero = new Hero();
int htm ;

    @Override
    public synchronized Integer call() throws Exception {
        System.out.printf("%s發動攻擊 %s遭受攻擊\n",hero.name(),monster.name());
        
        System.out.printf("%s剩餘血量:%d\n",monster.name(),htm);
    return htm;
    }    
}
