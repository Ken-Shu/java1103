
package com.Homepractice.HomeToPattern;

public class Hero extends RPG{
    
    private int atk =20;
    private int hp = 100;

    public Hero(){
        Hero="小王";
    }
    
    @Override
    public String getname() {                
        return "HeroName:"+Hero;
    }

    @Override
    public String getAbility() {       
        return "英雄攻擊力:"+atk+"英雄血量:"+hp;
    }
    
}
