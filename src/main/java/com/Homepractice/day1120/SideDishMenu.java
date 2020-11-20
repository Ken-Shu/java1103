package com.Homepractice.day1120;

public class SideDishMenu {
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

    public SideDishMenu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "名稱=" + name + ", 價格=" + price ;
    }

}
