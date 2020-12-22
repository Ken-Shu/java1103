package com.ocp13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
    public static void main(String[] args) {
        Set set = new TreeSet();
        //今彩539 , 1~39中取5個不重複的數字
        //電腦選號
        while(set.size() < 5){
            //產生一個1~39的隨機數
            int n = new Random().nextInt(39+1);
            set.add(n);
            System.out.println("加入==>"+n);
        }
        System.out.println(set);
        //彩球的號碼總和
        //Java 7 for -loop
        int sum = 0;
        for(Object obj : set){
            if(obj instanceof Integer){ //instanceof 假設 obj 可以轉成 Integer
                sum += (Integer)obj;
            } 
        }
        System.out.println(sum);
        //Java 8
        
        int sum2 = set.stream().mapToInt(e -> ((Integer)e).intValue()).sum();
        int sum3 = set.stream().mapToInt(e -> (Integer)e).sum();
        System.out.println(sum3);
        System.out.println(sum2);
    }
    
}
