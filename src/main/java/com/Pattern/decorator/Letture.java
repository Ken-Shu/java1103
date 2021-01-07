package com.Pattern.decorator;

public class Letture extends SideDish{
    
    public Letture(Food food) {
        super(food);
        super.name="生菜"; //super 也可不寫
        super.price = 15;
    }
    
}
