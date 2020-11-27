package com.Homepractice.day1127;

import java.util.Arrays;

public class Arraytwo {
    public static void main(String[] args) {
        int[][] array = new int[3][1];
        array[0][0]=1;//{{1,2,3},{4,5,6}}
        //array[0][0]=2;
        array[1][0]=3;
        //array[1][0]=4;
        array[2][0]=5;
        //array[2][0]=6;
        for (int i = 0 ; i<array.length;i++){
        System.out.println(Arrays.toString(array[i]));
      }
    }
}
