package com.Homepractice.day1113;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo2 {

    public static void main(String[] args) {
        int[] dice = {1, 2, 3, 4, 5, 6};
        int score = getScore(dice);
        System.out.println(score);
        //擲 n = 4 的總分
        int[] scores = playDice(dice, 4);
        System.out.println(Arrays.toString(scores));//列出陣列字元[]形式
        int sum = getSum(scores);
        System.out.println(sum);
    }

    public static int[] playDice(int[] dice, int n) {
        int[] scores = new int[n];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = getScore(dice);
        }
        return scores;
    }

    public static int getSum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public static int getScore(int[] dice) {
        Random r = new Random();
        int index = r.nextInt(dice.length);
        int score = dice[index];
        return score;
    }

}
