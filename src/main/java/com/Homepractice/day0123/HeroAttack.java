package com.Homepractice.day0123;

import java.util.concurrent.Callable;

public class HeroAttack implements Callable<Integer>{
Monster monster = new Monster();
Hero hero = new Hero();
int htm ;
int monster_hp = monster.getHp();
int hero_atk = hero.getAtk();

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        System.out.printf("%s發動攻擊 %s遭受攻擊\n",hero.name(),monster.name());
       monster_hp = (monster_hp -= hero_atk) ;
        System.out.printf("%s剩餘血量:%d\n",monster.name(),monster_hp);
    return monster_hp;
    }    
}
