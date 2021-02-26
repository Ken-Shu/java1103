
package com.Homepractice.HomeToPattern;

public class Show {
    public static void main(String[] args) {
        RPG rpg = new Hero();
        rpg = new Monster_Dog(rpg);
        System.out.println("名稱:"+rpg.getname());
        System.out.println("能力值: "+rpg.getAbility() );
        
    }
    
}
