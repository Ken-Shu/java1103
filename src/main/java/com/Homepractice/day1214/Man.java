package com.Homepractice.day1214;

public class Man {
     public Zoo getbird(){
         Sparrow sparrow = new Sparrow("麻雀", 2);
         return sparrow;
     }
     //顯示腳數量
     public void printFoot(Zoo getBird){
              
         System.out.println(getBird.foot());
     }
     //顯示動物名稱
     public String birdName(Zoo getName){
         Sparrow sp = new Sparrow();
         
         sp.setName(getName.name());
         
         return sp.getName();
     }
     //吃甚麼
     public void eat(Zoo eating){
         System.out.print("吃:");
         eating.eat();
     }
     
}
