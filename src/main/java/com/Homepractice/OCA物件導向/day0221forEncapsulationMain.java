
package com.Homepractice.OCA物件導向;



public class day0221forEncapsulationMain {
    public static void main(String[] args) {
        day0221forEncapsulation s1 = new day0221forEncapsulation();
        day0221forEncapsulation s2 = new day0221forEncapsulation();
        
        for (int i = 0; i < s1.getMoney(); i++) {
            s1.setMoney((5000)-i);
            System.out.println("s1:"+s1.getMoney());
            s2.setMoney(i);
            System.out.println("s2:"+s2.getMoney());
        }
    }
}
