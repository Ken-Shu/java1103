package com.Homepractice.day1209;



public class Do {
    public static void main(String[] args) {
        Main main = new Main();
        Zoo [] birds = main.getBirds();
        main.printAllBirdName((Bird[]) birds);
        main.printAllBirdFoot((Bird[])birds);
    }
    
}
