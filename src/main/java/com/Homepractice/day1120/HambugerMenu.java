package com.Homepractice.day1120;

public class HambugerMenu {
private String name;

private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public HambugerMenu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "套餐:" + name + ", 價格:" + price ;
    }

}
