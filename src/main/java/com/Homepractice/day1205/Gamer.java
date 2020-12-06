package com.Homepractice.day1205;

public class Gamer extends Server {

    String name;
    public int money;
    public int capsule;
    public int volume; //卷

    public Gamer(int money) {
        this.money = money;
    }

    public Gamer() {
    }

    public Gamer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCapsule() {
        return capsule;
    }

    public void setCapsule(int capsule) {
        this.capsule = capsule;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int volume() {
        return volume;
    }

    @Override
    public String player() {
        return name;
    }

    @Override
    public int capsule() {
        return capsule;
    }

    @Override
    public int money() {
        return money;
    }

}