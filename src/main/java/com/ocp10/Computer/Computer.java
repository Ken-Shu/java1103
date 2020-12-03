package com.ocp10.Computer;

public interface Computer {
//可不用加屬性 預設為public
    int volt = 110; //伏特 ,public static final

    int add(int x, int y); //計算  ,public abstract

    String getName(); // 品牌, public abstract
}
