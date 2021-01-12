package com.ocp17_gc;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;

public class CheckMemory {
    public static void main(String[] args) {
        System.out.printf("%,d bytes\n",Runtime.getRuntime().freeMemory());
               
        Faker faker = new Faker();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add(faker.name().lastName());
        }  
        System.out.printf("%,d bytes\n",Runtime.getRuntime().freeMemory()); //查看記憶體
        faker = null; //清空記憶體 faker 的資料
        names = null; //清空記憶體 names 的資料
        System.gc();
        //此時僅有names 被清空 但是記憶體本身內的內容並沒有被清空
        //建議系統執行 GC
        //才可執行清空記憶體
        System.out.printf("%,d bytes\n",Runtime.getRuntime().freeMemory());
        //...
    }
    
}
