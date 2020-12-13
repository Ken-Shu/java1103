package com.Homepractice.day1213;

public class Dog extends WhatEat{
    private String name;
    private int getprice;

    public Dog(String name, int getprice) {
        this.name = name;
        this.getprice = getprice;
    }

    public Dog() {
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int getprice() {
       return getprice;
    }
    
}
