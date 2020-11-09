
package com.opc2;

public class TryToATM_Account {
String name; // 姓名 
String stock;// 股票
public int input_money; //存錢
private int balance2; // 餘額
public int buy_amount; //持有數量

void inputmoney(int money2){
    if (money2>=0){
        balance2+=money2;
        System.out.printf("餘額顯示:%s\n",balance2);
    }
}
void price(int price){
    if (buy_amount<=0 ){
        buy_amount+=price;
        System.out.printf("成功購買 %d 張\n",price);
    }else if(buy_amount>=(buy_amount+=price)){
        buy_amount-=price;
    }
}

void buystock(int money2){
    if (balance2>=money2){
        balance2-=money2;
        System.out.printf("購買stock成功 支付 %d\n",money2);                                  
}else {System.out.println("購買失敗 餘額不足");}
}
//x 股價
    void sellstock(int x){
    if(buy_amount>=0){
        balance2+=buy_amount*x;
        System.out.printf("售出stock成功 入帳 %d\n",(buy_amount*x));
    }else {System.out.println("售出失敗 請再次操作");
} 
    }
 
void printBalance2(){
          System.out.printf("姓名:%s 持有數量:%d 餘額:%d\n",name,buy_amount,balance2);
}
}
