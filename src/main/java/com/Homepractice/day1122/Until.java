package com.Homepractice.day1122;

import java.util.Random;

public class Until {

    public static int[] english () {
        Random r = new Random();        
        int []english1= new int [5];
        for (int i = 0; i < english1.length;) {
            int num = r.nextInt(100)+1;
            if(num>=0 && num <=100){
                english1[i]=num;
                i++;
            }
        }
        return english1;
    }
    public static int []math() {
        Random x = new Random();
        int []math1 =new int [5];
        for (int i = 0; i < math1.length;) {
            int num1 = x.nextInt(100)+1;
            if(num1<=100 && num1>=0){
              math1[i]=num1;
              i++;
            }
        }return math1;
    }

   
    }
