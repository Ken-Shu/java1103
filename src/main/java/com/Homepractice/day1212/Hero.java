package com.Homepractice.day1212;

public class Hero extends Skill{
private int hp = 100;
private int mp = 50;
private int atk=20 ;
private String HeroName;

    public Hero() {
    }

    public Hero(String HeroName) {
        this.HeroName = HeroName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public String getHeroName() {
        return HeroName;
    }

    public void setHeroName(String HeroName) {
        this.HeroName = HeroName;
    }

    @Override
    public String HeroName() {
        return HeroName;
    }

    @Override
    public int hp() {
        return hp;
    }

    @Override
    public int mp() {
        return mp;
    }

    @Override
    public int atk() {
        return atk;
    }
   
}
