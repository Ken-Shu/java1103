
package com.opc2;

public class TryToATM_Account {
    String stock_name;  //股票
    public int stock_value; //股票價值
    String buy_name; //購買人姓名
    private int buy_namebalance;//購買人餘額
    public int stock_x; //份數
    private int name_stock; //購買人持有份數

void buystock(int money2){   //購買股票
    if(money2<buy_namebalance){
        name_stock=name_stock+stock_x;
        buy_namebalance -= money2;
        System.out.printf("購買成功 餘額剩下:%d",buy_namebalance);
    }else {System.out.println("餘額不足");}
}
void sellstock(int money2){
    if(name_stock>=stock_x){
        buy_namebalance=buy_namebalance+(stock_value*stock_x);
        System.out.printf("賣出成功 餘額剩下:%d",buy_namebalance);
    }else {System.out.println("賣出失敗 張數不足");}
}
        }