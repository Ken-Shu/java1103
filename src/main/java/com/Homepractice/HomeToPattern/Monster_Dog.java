
package com.Homepractice.HomeToPattern;

public class Monster_Dog extends Fight{

    public Monster_Dog(RPG rpg) {
        super(rpg);
        super.Monster="狗";
        super.Abiltiy=ability();
    }
    public String ability(){
    int atk = 5;
    int hp = 20;
     return "怪物攻擊力:"+atk+"怪物血量:"+hp;
    }
}
