package com.opc2;

import java.util.Scanner;

public class TryToATM {

    public static void main(String[] args) {
        //TryToATM_Account n1 =new TryToATM_Account();
        TryToATM_Account s1 = new TryToATM_Account();

        TryToATM_Account n1 = null;
        int x = 500;
        

        run:
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("帳號輸入:1");
            System.out.println("存錢:2");
            System.out.println("股票購買:3");
            System.out.println("股票販賣:4");
            System.out.println("餘額查詢:5");
            System.out.println("離開:6");
            //--------------------------------
            int ucs = sc.nextInt();
            switch (ucs) {
                case 1:
                    System.out.println("請輸入帳號:");
                    n1 = new TryToATM_Account();
                    String name2 = sc.next();
                    n1.name = name2; break;
                case 2:
                    System.out.print("請輸入存入金額:");
                    int money = sc.nextInt();
                    if (n1 != null) {
                        n1.inputmoney(money);
                    } else {
                        System.out.println("請輸入帳號");
                    }break;
                case 3:
                    // x = 500;
                    System.out.printf("股價:%d\n",x);
                    System.out.println("請輸入購買張數:");
                    int price3 = sc.nextInt();
                    if(n1 != null){
                    n1.price(price3);
                    }
                    if (n1 != null) {
                        n1.buystock(x*price3);
                    } else {
                        System.out.println("請輸入帳號");
                    }break;
                case 4:
                   // x = 500;
                System.out.printf("股價:%d\n",x);
                    System.out.println("請輸入販售張數:");
                    int price4 = sc.nextInt();
                    if (n1 != null){
                    n1.sellstock(x);
                    }else {System.out.println("請輸入帳號");
                    }
                    
                case 5:
                    System.out.println("查詢:");
                    if (n1 != null) {
                        n1.printBalance2();
                    } else {
                        System.out.println("請輸入帳號");
                    }break;
                case 6:
                System.out.println("離開");
                break run;
            }
        } while (true);
    }
}
