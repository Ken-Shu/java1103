package com.Homepractice.day0113;

public class HowtoShpping {

    public ShoppingWeb[] s1(){
        ShoppingWeb[] s1s = {
            new Skirt(5000, 10),
            new Skirt(10000, 5)
        };
        return s1s;
    }
public void printprice(ShoppingWeb[] s1s){
    int sum = 0;
   for(ShoppingWeb sh1 : s1s){
    sum += sh1.price()*sh1.amount();
   }
    System.out.println("總金額 :"+sum);
}
public void printallamoumt(ShoppingWeb [] s1s){
    int allamount = 0;
    for(ShoppingWeb sh1 : s1s){
        allamount += sh1.amount();
    }
    System.out.println("總數量:"+allamount);
}
}
