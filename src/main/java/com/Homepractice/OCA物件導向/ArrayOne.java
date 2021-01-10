package com.Homepractice.OCA物件導向;

public class ArrayOne {
    public static void main(String[] args) {
       
        int [] one = {0};
        int [] two = {10};
        
        exchange(one , two);
        
        
        System.out.println(one[0]+ " and "+two[0]);
    }
    
    public static void exchange(int [] o ,int [] t ) {
        
        o = t;
        
        t[0] = 50;
        System.out.println("exchange  o : "+o[0]);
    }
   
}
