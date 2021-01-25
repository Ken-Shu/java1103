package com.Homepractice.day0125;


public class GetandSetMain {
    public static void main(String[] args) {
        GetandSet gs  = new GetandSet();
        gs.setA(10);
        gs.setB(30);
        System.out.println(gs.getA());
        System.out.println(gs.getB());
            int a = gs.getA();
            int b = gs.getB();
            for (int i = 0; true; i++) {
             if(b >= 0){
                System.out.println(b -= a);                
            }else break;
        }
           

    }
    
}
