package com.Homepractice.day0123;

public class Hero implements Ability , Runnable{
private String name = "小明";
public int atk =10;
public int hp = 100;

    public Hero() {
    }

    public Hero(String name) {
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
        System.out.println("英雄名稱:"+name);
        System.out.println("攻擊力:"+atk);
        System.out.println("血量:"+hp);
    }
    
}
