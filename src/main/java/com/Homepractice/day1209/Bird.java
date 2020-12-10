package com.Homepractice.day1209;

public class Bird extends ZooSystem {

    public String name;
    public int foot;
    public String move;

    public Bird(String name, int foot) {
        this.name = name;
        this.foot = foot;
    }

    public Bird(String move) {
        this.move = move;
    }

    public Bird() {
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

    public String birdmove() {
        this.move = birdmove();
        System.out.println("飛行");
        return birdmove();
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

   

    @Override
    public String name() {
        return name;
    }

    @Override
    public int foot() {
        return foot;
    }

    @Override
    public String move() {
        return move;
    }

}
