package com.Homepractice.day1209;

import com.Homepractice.day1209.Zoo;


public class AnimalService{

    public Zoo[] getBirds() {
        Zoo[] Birds = {
            new Bird("麻雀", 2),
            new Bird("鴕鳥", 2)
        };
        return Birds;
    }
    

    public int printAllBirdFoot(Bird[] birds) {
        int x = 0;
        for (Bird bir : birds) {
            x += bir.getFoot();
            
        }
        System.out.printf("總支數%d",x);
        return x;
        
    }
//顯示有哪些鳥
    public void printAllBirdName(Bird[] birds) {
        
        for (Bird bir : birds) {
            String className = bir.getClass().getSimpleName();
            System.out.printf("種類:%s , 名稱:%s 飲食:\n", className, bir.getName());
            bir.eat();
        }
        
    }
}
