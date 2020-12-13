package com.Homepractice.day1212;

public class MyHero {


 public HeroAbility getHeroname(){
     HeroAbility Heroname = new Hero("明");
    return Heroname;
 }
 
public void print(HeroAbility getname){
        Hero hero = new Hero();
        HeroAbility name1 = getname;    
        
        int hp = hero.getHp();
        int mp = hero.getMp();
        int atk = hero.getAtk();
         System.out.println("角色名稱"+name1);
         System.out.println("血量"+hp);
         System.out.println("魔力"+mp);
         System.out.println("攻擊"+atk);
    }

}
