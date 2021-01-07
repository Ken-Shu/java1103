package com.Pattern.decorator;

public class Ham extends SideDish{
    
    public Ham(Food food) {
        super(food);
        super.name="火腿"; //super 也可不寫
        super.price = 30;
    }
    
}
