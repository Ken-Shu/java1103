package com.Homepractice.day1121;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest2 {

    public static void main(String[] args) {
        Until un = null;
        Scanner sc = new Scanner(System.in);
        int[] number = {1,2,3,4,5,6};        
        int[] english = {80, 60, 90, 45, 70, 55};
        int[] math = {60, 55, 90, 70, 35, 100};

        acc:
        do {
            un =new Until();
            System.out.println("請輸入學號1~6:");
            int i = sc.nextInt();
            if (un != null) {
                un.number = number[i]-1;            
            } else System.out.println("請輸入學號");
                
            if (un != null) {
                un.english2(english[i]);
                un.math2(math[i]);
                un.sum(i, english[i], math[i]);
            }
            if (un!=null){
            
            }
            
        } while (true);
    }
}
