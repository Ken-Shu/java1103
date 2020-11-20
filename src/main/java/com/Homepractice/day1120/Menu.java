package com.Homepractice.day1120;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//點漢堡------------------
        System.out.println("請輸入你要的漢堡號碼:");

        HambugerMenu hone = new HambugerMenu("1號大麥克", 80);
        HambugerMenu htwo = new HambugerMenu("2號吉士堡", 60);
        HambugerMenu hthree = new HambugerMenu("3號麥香魚", 70);
        System.out.println(hone.toString());
        System.out.println(htwo.toString());
        System.out.println(hthree.toString());
        int h = sc.nextInt();
        int score = 0;
        switch (h) {
            case 1:
                System.out.println(hone.toString());
                score += hone.getPrice();
                
                break;
            case 2:
                System.out.println(htwo.toString());
                score += htwo.getPrice();
                break;
            case 3:
                System.out.println(hthree.toString());
                score += hthree.getPrice();
                break;
        }
        //點飲料----------------------------
        System.out.println("請選擇你要的飲料:");
        DrinkMenu done = new DrinkMenu("1號 可樂", "大", 50);
        DrinkMenu dtwo = new DrinkMenu("2號 可樂", "小", 30);
        DrinkMenu dthree = new DrinkMenu("3號 綠茶", "大", 50);
        DrinkMenu dfour = new DrinkMenu("4號 綠茶", "小", 30);
        System.out.println(done.toString());
        System.out.println(dtwo.toString());
        System.out.println(dthree.toString());
        System.out.println(dfour.toString());
        int y = sc.nextInt();
        switch (y) {
            case 1:
                System.out.println(done.toString());
                score += done.getPrice();
                break;
            case 2:
                System.out.println(dtwo.toString());
                score += dtwo.getPrice();
                break;
            case 3:
                System.out.println(dthree.toString());
                score += dthree.getPrice();
                break;
            case 4:
                System.out.println(dfour.toString());
                score += dfour.getPrice();
                break;
        }
        //點配菜-----------------------------------
        System.out.println("請選擇你要的配菜:");
        SideDishMenu sone = new SideDishMenu("1號 薯條", 50);
        SideDishMenu stwo = new SideDishMenu("2號 雞塊", 60);
        System.out.println(sone.toString());
        System.out.println(stwo.toString());
        int z = sc.nextInt();
        switch (z) {
            case 1:
                System.out.println("你選擇1號:薯條");
                score += sone.getPrice();break;
                
            case 2:
                System.out.println("你選擇2號:雞塊");
                score += stwo.getPrice();break;
        }
        System.out.printf("總金額:%d",score);
    }
}
