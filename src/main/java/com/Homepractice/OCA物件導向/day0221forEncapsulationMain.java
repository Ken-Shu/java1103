
package com.Homepractice.OCA物件導向;

import java.util.Scanner;

public class day0221forEncapsulationMain {
    public static void main(String[] args) {
        System.out.println("今天我要存錢");
        System.out.print("請輸入存入金額 : ");
        Scanner sc = new Scanner(System.in);
        day0221forEncapsulation d1 = new day0221forEncapsulation();
        int money = sc.nextInt();
        d1.setMoney(money);
        System.out.println("成功存入了:"+d1.getMoney());
        System.out.println(d1.toString());
        
    }
}
