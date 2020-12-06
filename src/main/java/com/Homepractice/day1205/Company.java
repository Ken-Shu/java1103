package com.Homepractice.day1205;

import java.util.Scanner;
import com.Homepractice.day1205.Gamer;
import java.util.Random;

public class Company {

    Gamer gar = new Gamer();
    String name;
    int inputmoney;
    int volume = 30; //抽獎卷價格

    //輸入名稱
    public Capsule Gamer(String name) {
        this.name = name;
        return Gamer(name);
    }

    //輸入儲值金額
    public Capsule Gamer(int money) {
        inputmoney += money;
        return Gamer(money);
    }

    //確認儲值金額
    public void print(String name, int money) {
        System.out.printf("姓名:%s , 金額:%d\n", name, money);
    }
    //購買卷 餘額

    public int buyvolume(int amount) {

        int volumeamount = 0;
        gar.setCapsule(amount);

        gar.volume = this.volume;

        if (inputmoney >= (gar.volume * amount)) {
            volumeamount += inputmoney - (gar.volume * amount);
            System.out.printf("一張%d元 成功購買票卷%d張 餘額:%d\n", gar.volume, gar.getCapsule(), volumeamount);
        } else if (inputmoney < (gar.volume * amount)) {
            System.out.println("購買失敗");
            System.exit(0); //要問老師
        }
        return volumeamount;
    }
    //印出獎項
    String[][] prize = {{"橡皮擦"}, {"鉛筆"}, {"彈珠"}, {"糖果"}, {"大獎:跑車"}};

    public void printprize() {
        for (int i = 0; i < prize.length; i++) {
            System.out.println(prize[i][0]);
        }
    }

    //使用轉蛋
    public int capsule(int am) {
        Random r = new Random();
        int cound = gar.getCapsule();

        if (gar.getCapsule() >= am  ) {
            for(int i =0; i<=am; i++){        
        int prize1 = r.nextInt(4);
        int persent = (r.nextInt(99) + 1)/ 10;                  
            switch (persent) {
                case 10:  
                    System.out.printf("恭喜得到%s\n",prize[4][0]);
                case 9:                    
                case 8:
                case 7:
                case 6:
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:                                            
                case 0:
                    System.out.printf("得到%s\n", prize[prize1][0]);
            }
            if(i==20){
                System.out.printf("恭喜得到%s\n",prize[4][0]);
                break;
            } 
            }
        } else {
            System.out.println("票卷不足");
        }
        System.out.printf("剩餘%d張票卷\n", gar.getCapsule() - am);
        return cound-am;
    }
}
