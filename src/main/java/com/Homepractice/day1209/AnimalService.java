package com.Homepractice.day1209;

import com.Homepractice.day1209.Zoo;


public class AnimalService{

    public Zoo[] getBirds() {
        Zoo[] birds = {
            new Bird("麻雀", 2),
            new Bird("鴕鳥", 2)
        };
        return birds;
    }
    

    public int printAllBirdFoot(Zoo[] birds) {
        int x = 0;
        for (Zoo bir : birds) {
            x += bir.foot();            
        }
        System.out.printf("總支數%d",x);
        return x;
        
    }
//顯示有哪些鳥
    public void printAllBirdName(Zoo[] birds) {
        
        for (Zoo bir : birds) {
            String className = bir.getClass().getSimpleName();
            System.out.printf("種類:%s , 名稱:%s 飲食:\n", className, bir.name());
            bir.eat();
        }
        
    }
}
