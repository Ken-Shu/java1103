package com.Homepractice.day0117;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Array_Practice {
    public static void main(String[] args) {
        List<String> one =new LinkedList<>();
        one.add("one");
        one.add("one");
        one.add("two");
        one.add("three");
        for (int i = 0; i < one.size(); i++) {
            if(one.contains("one")){
                System.out.println(one);
            }else System.out.println("no mach"); break;
        }
        Set<Integer> two = new HashSet<>();
        two.add(1);
        two.add(1);
        two.add(2);
        two.add(3);
        two.stream().mapToInt(e -> e).forEach(System.out::print);
    }
    
}
