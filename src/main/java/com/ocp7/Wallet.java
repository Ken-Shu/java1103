package com.ocp7;

public class Wallet {
    private static String owner ="媽媽的錢包";
private int money =100_0000;
public int getAndPrintMoney(){
    //資源指的就是(屬性)與(方法)
    //在物件方法中 可以存取物件資源與類別資源
    System.out.println(owner);
    System.out.println(money);
    return money;
}
public static void printMoney(){
    //在類別方法中只能存取類別資源 (static類別)
    System.out.println(owner);
    // 如預在(static類別)中使用物件資源 則必須在類別內new一個物件資源
    Wallet wallet = new Wallet();
    System.out.println(wallet.money);
           
}
}
