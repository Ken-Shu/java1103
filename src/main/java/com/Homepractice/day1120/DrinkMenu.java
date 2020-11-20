package com.Homepractice.day1120;

public class DrinkMenu {
private String name;
private String size;
private int price;

    public DrinkMenu(String name, String size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名稱=" + name + ", 大小=" + size + ", 價格=" + price;
    }

}