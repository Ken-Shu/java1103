package com.Pattern.decorator;

public class Onion extends SideDish{
    
    public Onion(Food food) {
        super(food);
        super.name="洋蔥"; //super 也可不寫
        super.price = 12;
    }
    
}
