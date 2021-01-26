package com.Homepractice.day0123;

import java.util.concurrent.locks.ReentrantLock;

public class Fight implements Runnable{
Monster monster = new Monster();
Hero hero = new Hero();
private static final ReentrantLock lock = new ReentrantLock();
    
    
    @Override
    public void run() {
        try {
            lock.lock();
        System.out.println("遭遇戰鬥:");
        System.out.printf("英雄名稱:%s  HP:%d  ATK:%d\n",hero.name(),hero.hp(),hero.atk());
        System.out.printf("怪物名稱:%s  HP:%d  ATK:%d\n",monster.name(),monster.hp(),monster.atk());     
        } catch (Exception e) {
        }finally{
           lock.unlock();
        }
            
    }
    
}
