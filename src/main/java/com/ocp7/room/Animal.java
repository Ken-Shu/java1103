package com.ocp7.room;

public class Animal {

    private String name;
    private int foot;

    public Animal(String name, int foot) {
        this.name = name;
        this.foot = foot;
    }

    public Animal() {
    }

    public String getNeme() {
        return name;
    }

    public void setNeme(String neme) {
        this.name = neme;
    }

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }

    public void move(){
        System.out.println("移動");
    }
    
    @Override
    public String toString() {
        String className = getClass().getSimpleName(); //取的物件類別名稱
        //getsimpleName 會去掉package  getName 則會顯示package的全名
        return ":" + name + " 有" + foot + "隻腳";
    }

}
