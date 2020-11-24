package com.ocp7.room;

public class Ostrich extends Bird{

    public Ostrich(String name, int foot) {
        super(name, foot);
    }

    public Ostrich() {
    }
    @Override
    public void move(){
        System.out.println("會走");
    }
}
