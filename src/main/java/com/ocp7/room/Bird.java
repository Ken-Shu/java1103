package com.ocp7.room;

public class Bird extends Animal {

    public Bird(String name, int foot) {
        super(name, foot);
    }  //一定要exends 才能 super 呼叫老爸

    public Bird() {
    }

    @Override
    public void move() {
        System.out.println("會飛");
    }

    
}
