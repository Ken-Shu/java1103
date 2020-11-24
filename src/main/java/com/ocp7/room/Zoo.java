package com.ocp7.room;

public class Zoo {
    public static void main(String[] args) {
        
        Bird bird = new Bird();
        bird.setNeme("鸚鵡");
        bird.setFoot(2);
        Lion lion = new Lion();
        lion.setNeme("美洲獅");
        lion.setFoot(4);
        System.out.println(bird);
        System.out.println(lion);
    }
    
}
