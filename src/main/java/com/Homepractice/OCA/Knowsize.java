package com.Homepractice.OCA;

import java.util.HashSet;
import java.util.Set;

public class Knowsize {
    public static void main(String[] args) {
        String [][] s1 ={{"1","123","12555"},{"11"}};
        System.out.println(s1[0].length);
        String s2 ="123456";
        System.out.println(s2.length());
        Set<Integer> set = new HashSet();
        set.add(12345);
        System.out.println(set.size());
    }
    
}
