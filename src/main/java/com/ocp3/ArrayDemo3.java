package com.ocp3;

public class ArrayDemo3 {

    public static void main(String[] args) { //有初始值得陣列[]不可加數字
        int[] score = new int[]{10, 9, 8}; // 也可以不用加上 new int[](僅變數第一次建構之特權)
        score = new int[]{100, 90, 80};  //有初始值第二次須加上 new int[]
        System.out.println("列出成績:");
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        System.out.println("總分:");
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println(sum);
        System.out.println("平均:");
        int avg = sum / score.length;
        System.out.println(avg);
    }
}
