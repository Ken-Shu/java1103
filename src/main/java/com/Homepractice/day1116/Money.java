
package com.Homepractice.day1116;


public class Money {
    String name;
    private int balance;
    
   void inputmoney(int money){
       if(money>0){
       balance+=money;
           System.out.println("存款成功");
       }else System.out.println("存款失敗");
    }
       void outputmoney(int money){
       if(balance>0 && balance >money){
           balance-=money;
           System.out.println("提款成功");
       }else System.out.println("提款失敗");
   }
       void display(){
           System.out.printf("餘額:%d\n",balance);
       }
}     
    

