package com.Homepractice.day0123;

public class Monster implements Ability ,Runnable{
private String name;
private int atk =5;
private int hp = 50;

    public Monster() {
    }

    public Monster(String name) {
        this.name = name;
   
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    @Override
    public String name() {
        return name;
    }

    @Override
    public int atk() {
        return atk;
    }

    @Override
    public int hp() {
        return hp;
    }

    @Override
    public void run() {
        System.out.println("怪物名稱:"+name);
        System.out.println("攻擊力:"+atk);
        System.out.println("血量:"+hp);
    }
    
}
