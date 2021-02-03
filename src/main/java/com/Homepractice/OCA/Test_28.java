package com.Homepractice.OCA;

import java.util.ArrayList;
import java.util.List;

public class Test_28 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("This is Test");
        String s2 = s1.toString();
        List<String> list = new ArrayList<>();
        System.out.println(s1.getClass());
        System.out.println(s2.getClass());
        System.out.println(list.getClass());
    }
    
}
