package com.Homepractice.day0123;

import java.util.concurrent.Callable;

public class MonsterAttack implements Callable<Integer>{
Monster monster = new Monster();
Hero hero = new Hero();
int hero_hp = hero.getHp();
int monster_atk = monster.getAtk();

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
         System.out.printf("%s發動攻擊 %s遭受攻擊\n",monster.name(),hero.name());
        hero_hp = (hero_hp -= monster_atk) ;
        System.out.printf("%s剩餘血量:%d\n",hero.name(),hero_hp);
    return hero_hp;
    }    
    }
