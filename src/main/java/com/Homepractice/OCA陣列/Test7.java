package com.Homepractice.OCA陣列;

public class Test7 {
static boolean a; //false
    public static void main(String[] args) {
        boolean b =true;
        int count = 8;
        do {            
            System.out.println("Hello Java"+count+"!");
            if(count>=7){
                b=false;
            }
        } while (a != b && count >4);
        count -= 2;
        System.out.println(count);
    }
}
