package com.Pattern.decorator;

public class Subway {
    public static void main(String[] args) {
        Food food = new Bread(); //全部都是Food 先點麵包
        food = new Ham(food); //食物裡夾火腿
        food = new Tuna(food);
        food = new Tomato(food);
        food = new Tomato(food);
        food = new Olives(food);
        food = new Letture(food);
        food = new Onion(food);
        food = new Onion(food);
        food = new Onion(food);
        
        System.out.println("商品: "+ food.getName());
        System.out.println("價格: "+ food.getPrice());
    }
    
}
