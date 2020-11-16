package com.Homepractice.day1116;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Money ac1 = null;
        atm_loop:
        do {
            //----------------------------------
            System.out.println("輸入名稱1:");
            System.out.println("存款 2:");
            System.out.println("提款 3:");
            System.out.println("餘額查詢4:");
            //----------------------------------
            Scanner sc = new Scanner(System.in);
            int in = sc.nextInt();
            switch (in) {
                case 1:
                    ac1 = new Money();
                    System.out.println("請輸入名稱");
                    String name = sc.next();
                    ac1.name = name;
                    break;
                case 2:
                    if (ac1 != null) {
                        System.out.println("請輸入存入金額");
                        int money = sc.nextInt();
                        ac1.inputmoney(money);
                    } else {
                        System.out.println("請先建立帳戶!");
                    }break;
                case 3:
                    if (ac1 != null) {
                        System.out.println("請輸入提款金額");
                        int money = sc.nextInt();
                        ac1.outputmoney(money);
                    } else {
                        System.out.println("請先建立帳戶!");
                    }break;
                case 4:
                    if (ac1 != null) {
                        ac1.display();
                    } else {
                        System.out.println("請先建立帳戶!");
                    }break;
            }

        } while (true);
    }
}
