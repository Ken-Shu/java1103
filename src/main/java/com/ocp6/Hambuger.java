package com.ocp6;

public class Hambuger {
     private  String name;
     private int price;
     
     
     //建構子
    
    public Hambuger() {
    }

    public Hambuger(String name, int price) {
        this.name = name;
        this.price = price;
    }
    

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
        if(price > 0){
        this.price = price;
    }
    }

    @Override
    public String toString() {
        return "Hambuger{" + "name=" + name + ", price=" + price + '}';
    }
   
    }
   

