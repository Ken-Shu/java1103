package com.Homepractice.day1223;

import com.github.javafaker.Faker;
import java.util.Random;

public class Exam {
    private String name;
    private int sellmoney;
    private boolean pass;

    public Exam() {
        Faker faker = new Faker();
        Random r = new Random();
        name=faker.name().lastName();
        sellmoney = r.nextInt(100)+1;
        pass = r.nextInt(2)+1 ==0? true : false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellmoney() {
        return sellmoney;
    }

    public void setSellmoney(int sellmoney) {
        this.sellmoney = sellmoney;
    }

    public boolean isPass() {
       
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Exam{" + "name=" + name + ", sellmoney=" + sellmoney + ", pass=" + pass + '}';
    }
    
    
}
