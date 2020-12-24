package com.Poker;

import static com.Poker.PokerUtil.getPokers;
import static com.Poker.PokerUtil.getScore;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Queue<Poker> pokers = getPokers();
        Collections.shuffle((List) pokers);
        System.out.println(pokers);
        play(pokers);
    }

    public static void play(Queue<Poker> pokers) {
        List<Poker> myPokers = new LinkedList<>(); // 我手邊的牌
        List<Poker>pcPokers = new LinkedList<>();
        //莊家先拿一張牌
        pcPokers.add(pokers.poll());
        
        //user
        do {
            //檢查手邊的牌
            System.out.printf("你的牌是: %s 目前分數: %.1f  ",
                    myPokers, getScore(myPokers));
            //先判對是否爆了?
            if (getScore(myPokers) > 10.5) {
                System.out.println("爆了");
                break;
            }
            //是否過5關
            if (myPokers.size() == 5) {
                System.out.println("完美結束過5關");
                break;
            }
            //是否10.5
            if (getScore(myPokers) == 10.5) {
                System.out.println("完美 10.5 恭喜你贏了");
                break;
            }
            //是否要拿牌?
            Scanner sc = new Scanner(System.in);
            System.out.println("是否要牌(y/n) ? ");

            String yn = sc.next();
            if (yn.equals("y")) {
                Poker poker = pokers.poll();
                myPokers.add(poker);
            } else {
                break;
            }
        } while (true);
        
        //pc
        do {  
            if(getScore(pcPokers)>10.5){
                System.out.println("PC 爆了");
                break;
            }
            if(getScore(pcPokers) < 8){
                pcPokers.add(pokers.poll());
            }else{
                break;
            }
        } while (true);
        
        System.out.printf("User 的牌: %s 目前分數: %.1f",myPokers,getScore(myPokers));
        System.out.printf("PC 的牌: %s 目前分數: %.1f",pcPokers,getScore(pcPokers));
        System.out.println("剩餘的牌:" + pokers);
    }
}
