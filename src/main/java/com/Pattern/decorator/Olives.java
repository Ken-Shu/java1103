package com.Pattern.decorator;

public class Olives extends SideDish{
    
    public Olives(Food food) {
        super(food);
        super.name="橄欖"; //super 也可不寫
        super.price = 10;
    }
    
}
