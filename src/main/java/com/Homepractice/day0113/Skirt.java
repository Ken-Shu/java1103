package com.Homepractice.day0113;

public class Skirt extends ShoppingWeb2{
private int price;  //價錢
private int amount; //庫存

    @Override
    public int amount() {
        return amount;
    }

    @Override
    public int price() {
        return price;
    }

    public Skirt(int price, int amount) {
        this.price = price;
        this.amount = amount;
    }        
}
