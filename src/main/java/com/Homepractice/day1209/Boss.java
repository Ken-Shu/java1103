package com.Homepractice.day1209;

import com.Homepractice.day1209.AnimalService;
import com.Homepractice.day1209.Zoo;

public class Boss {
    public static void main(String[] args) {
        AnimalService service = new AnimalService();
        Zoo [] bird = service.getBirds();
       service.printAllBirdName((Bird[]) bird);
       service.printAllBirdFoot((Bird[])bird);
    }
    
}
