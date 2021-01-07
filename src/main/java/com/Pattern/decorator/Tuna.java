package com.Pattern.decorator;

public class Tuna extends SideDish{
    
    public Tuna(Food food) {
        super(food);
        super.name="鮪魚"; //super 也可不寫
        super.price = 25;
    }
    
}
