package com.ocp16_Exception;

//計算面積的類別
public class Square {
    public int getArea(int w , int h){
        //int area = w + h;  第一個版本
        int area = w * h;  // 第二個版本
        return area;
    }
}
