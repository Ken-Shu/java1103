package com.Homepractice.day0116;

public class Hero_Ken extends HeroAbility{
protected String name1;

    public Hero_Ken(String name1) {
        this.name1 = name1;
    }

    @Override
    public String name() {
        return name1;
    }
   public void print (){
       System.out.println("英雄名稱:"+name1);
       System.out.println("血量: "+hp);
       System.out.println("攻擊力: "+atk);
}
}