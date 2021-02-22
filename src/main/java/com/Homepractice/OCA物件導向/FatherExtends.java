
package com.Homepractice.OCA物件導向;

public class FatherExtends {
    public int money;
   public void brush(){
       System.out.println("爸爸洗澡!");
   }
   public int setmoney(int money){
       this.money = money;
       int father = 0;
       father += money;
       return money;
   }
   public int getmoney(){
       return this.money;
}
}