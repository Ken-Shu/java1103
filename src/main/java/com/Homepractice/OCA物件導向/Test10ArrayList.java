package com.Homepractice.OCA物件導向;

import java.util.ArrayList;

public class Test10ArrayList {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(1);
        list.add(7);
        list.add(8);
        System.out.println(list.get(list.size()));
    }
}
