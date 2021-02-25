
package com.Homepractice.HomeToPattern;

public class Gost extends Game{
    public Gost(){
        name ="老師";
        sex=1;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public int getsex() {
    return sex;
    }
    
}
