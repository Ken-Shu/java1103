package com.Homepractice.OneToTry.多型;

public class Animal {
public static final int Dog = 1;
public static final int Cat = 2;
public static final int Bird = 3;
private String name;
private int type;

    public Animal(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
}

