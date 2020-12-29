
package com.ocp14;
//Vector 是執行續安全(多人存取安全)的集合
//Vector 自動增長機制 預設為(capacity)10 若資料(size)>10 若超過則會(原長度*2)

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v= new Vector(81,5); //在此指定預開啟空間 , 每次增加多少數值的空間
        for(int i = 1 ; i<=81; i ++){
            v.add(i);
        }
        v.add(100);
        System.out.println("Capacity"+v.capacity());
        System.out.println("Size"+v.size());
    }
}
