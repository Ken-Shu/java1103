package com.Homepractice.day1214;

public class Sparrow extends Bird {

    public String name;
    public int foot;

    public Sparrow(String name, int foot) {
        this.name = name;
        this.foot = foot;
    }

    public Sparrow() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int foot() {
        return foot;
    }

}
