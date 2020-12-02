package com.Homepractice.day1202;

public class Zoo {
    String name;
    private int foot;
    String move;

    public Zoo() {
    }

    public Zoo(String name, int foot, String move) {
        this.name = name;
        this.foot = foot;
        this.move = move;
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

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "Zoo{" + "名稱:" + name + ", 腳數:" + foot + ", 移動方式:" + move + '}';
    }
    
}
