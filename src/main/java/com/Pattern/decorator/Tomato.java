package com.Pattern.decorator;

public class Tomato extends SideDish{
    
    public Tomato(Food food) {
        super(food);
        super.name="番茄"; //super 也可不寫
        super.price = 15;
    }
    
}
