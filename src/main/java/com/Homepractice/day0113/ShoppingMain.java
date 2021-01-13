package com.Homepractice.day0113;

public class ShoppingMain {
    public static void main(String[] args) {
        HowtoShpping h1 = new HowtoShpping();
        ShoppingWeb[] s1 = h1.s1();
        h1.printallamoumt(s1);
        h1.printprice(s1);
    }
    
}
