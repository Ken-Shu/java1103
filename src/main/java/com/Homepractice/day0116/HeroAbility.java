package com.Homepractice.day0116;

public abstract class HeroAbility implements Hero{
    protected int hp = 50;
    protected  int atk = 5;

    @Override
    public int hp() {
        this.hp = hp();
        return hp();
    }

    @Override
    public int atk() {
        this.atk = atk();
        return atk();
    }
    
}
