package com.Homepractice.OCA建構子;

import java.util.ArrayList;
import java.util.List;

public class Testy_46 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Jim");
        names.add("Ricky");
        names.add("Jim");
        if(names.remove("Jim")){
            //寫在if內的動作也會被實作
            names.remove("Tom");
        }
        System.out.println(names);
    }
    
}
