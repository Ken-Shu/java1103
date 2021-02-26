
package com.Homepractice.HomeToPattern;

public class Fight extends RPG{
    protected RPG rpg;

    public Fight(RPG rpg) {
        this.rpg = rpg;
    }

    @Override
    public String getname() {
        return rpg.getname() +" , "+ Monster;
    }

    @Override
    public String getAbility() {
        return rpg.getAbility() +" , " +Abiltiy;
    }
    
}
