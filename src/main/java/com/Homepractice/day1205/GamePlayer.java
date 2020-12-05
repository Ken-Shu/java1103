package com.Homepractice.day1205;

import java.util.Scanner;
import com.Homepractice.day1205.Gamer;
import java.util.Random;

public class GamePlayer {
    Gamer gar = new Gamer();
    String name;
    int inputmoney;
    
    //輸入名稱
    public Capsule Gamer(String name){
        this.name =name ;
        return Gamer(name);
    }
    //輸入儲值金額
    public Capsule Gamer(int money){
        this.inputmoney+=money ;
        return Gamer(money);
    }
    //確認儲值金額
    public void print(String name , int money){        
    System.out.printf("姓名:%s , 金額:%d\n",name,money);
    }
      //購買卷 餘額
    public int buyvolume(int amount){
        int volumeamount = 0;
        gar.setCapsule(amount);
        gar.volume =30;
        if(inputmoney>=(gar.volume*amount)){
            volumeamount +=inputmoney-(gar.volume*amount);
            System.out.printf("成功購買票卷%d張 餘額:%d\n",gar.getCapsule(),volumeamount);
        }else System.out.println("購買失敗");
        return volumeamount;
    }
    //使用轉蛋
    public int capsule(int am){
        Random r = new Random();
        int get = 0;
        int gcp = gar.getCapsule()-am;
        if(gar.getCapsule()>=am){ 
            for (int i = 0; i < am; i++) {                 
                get = r.nextInt(99)+1;
                System.out.printf("抽到:%d\n",get);                
            }
        }else System.out.println("票卷不足");
        System.out.printf("剩餘%d張票卷\n",gcp);
        return get;
    }
    }
