package com.opc12.Lambda1;

public class Main {

    public static void main(String[] args) {
        //Brfore Java 8
        Add add = new Add() {
            @Override
            public void sum(int x, int y) {
                System.out.println(x+y);
            }
        };
        add.sum(10, 20);
        
    Add add2 = new Add() {
            @Override
            public void sum(int x, int y) {
                System.out.println(x*y);
            }
    };
    add2.sum(10, 20);
    }
}