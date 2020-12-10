package com.ocp11.case1;

public interface Game {
    void play();
    //在interface內可以有default方法
    default int price(){
        return 99;
    }    
    //如欲在interface內新增內容
    //則加上default在interface內實作
    default void copyRight(){
        System.out.println("版權所有");
    }
}
