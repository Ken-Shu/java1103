package com.Homepractice.day0117;

import java.util.HashMap;
import java.util.Map;

public class Map_practice {
    public static void main(String[] args) {
     String [] string1 = {"Apple","Banana","Chair"};
     Integer [] i ={1,2,3};
     
     Map<String, Integer> map = new HashMap<>();
        for (int j = 0; j < string1.length; j++) {
            map.put(string1[j],i[j]);
        }
        System.out.println(map);
        System.out.println(map.get("Apple"));
        map.entrySet().forEach(e -> System.out.println(e.getKey()+e.getValue()));
        //-------------------------------
        int [] x = new int[3];
        x[0]=0;
        x[1]=1;
        x[2]=3;
    Map<String , Integer> map2 = new HashMap<>();
     map2.put("one", 0);
     map2.put("two", 1);
     map2.put("three", 2);
        for (int j = 0; j < x.length ; j++) {           
            if(map2.containsValue(x[j])){
                System.out.println(x[j]);
            }else System.out.println("NotOK"+x[j]);
            
        }
        
        }
        
    }

