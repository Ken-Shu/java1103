package com.ocp7.room;

public class Lion extends Animal {

    public Lion(String name, int foot) {
        super(name, foot);
    }  //一定要exends 才能 super 呼叫老爸

    public Lion() {
    }
@Override
    public void move(){
    System.out.println("會跑");
}
    
}
