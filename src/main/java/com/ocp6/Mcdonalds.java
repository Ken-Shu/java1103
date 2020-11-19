package com.ocp6;

import java.util.Arrays;


public class Mcdonalds {
    public static void main(String[] args) {
        Hambuger h = new Hambuger();
        h.setName("大麥克");
        h.setPrice(72);
        //System.out.println(h); //等同h.toString()
        System.out.println(h.toString());
        
        Hambuger h2 =new Hambuger("麥香魚",60);           
        System.out.println(h2);
        
        Hambuger[] hambugers={h,h2};
        //求總金額
       int sum = 0;
        for(Hambuger hamburger:hambugers){
        sum+=hamburger.getPrice();
         }
        System.out.printf("總金額:$%d\n",sum);
        System.out.printf("你買的有:%s\n",Arrays.toString(hambugers));
    }        
}
