package com.opc12.Lambda1;

public class Main2 {
    public static void main(String[] args) {
        //Java 8 Landba
        Add add = (int x , int y) -> System.out.println(x+y);
        add.sum(10, 20);
        //參數也可不加型態  多行加上大括弧
        Add add2= ( x ,  y) -> {
            System.out.println(x*y);
            System.out.println(x+y);
        };
        add.sum(10, 20);
    }
}
