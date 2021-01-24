package com.Homepractice.day0123;

public class Fight implements Runnable{
Monster monster = new Monster();
Hero hero = new Hero();
    
    
    @Override
    public synchronized void run() {
        System.out.println("遭遇戰鬥:");
        System.out.printf("英雄名稱:%s  HP:%d  ATK:%d\n",hero.name(),hero.hp(),hero.atk());
        System.out.printf("怪物名稱:%s  HP:%d  ATK:%d\n",monster.name(),monster.hp(),monster.atk());        
    }
    
}
