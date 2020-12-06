package com.Homepractice.day1205;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        Company gp = new Company();        
        
        System.out.print("請輸入姓名:");
        String name = sc.next();
        gp.name=name;        
        System.out.printf("輸入名稱:%s\n",gp.name);
        
        System.out.print("請輸入金額:");
        int inputmoney = sc.nextInt();
        gp.inputmoney=inputmoney;                
        System.out.printf("輸入金額:%d\n",gp.inputmoney);
        System.out.println("帳戶內容:");
        //確認儲值內容
        gp.print(gp.name, gp.inputmoney);
        //購買票卷
        System.out.printf("一張%d元 請輸入購買張數:",gp.volume);
        int amount = sc.nextInt();
        gp.buyvolume(amount);
        System.out.println("-------------------------------------");
        //顯示獎項
        System.out.println("今日獎項:");
        gp.printprize();
        System.out.println("-------------------------------------");                
        //使用票卷
        System.out.print("請輸入使用張數:");
        int use = sc.nextInt();
        gp.capsule(use);
    }
    
}
