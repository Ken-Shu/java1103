package com.Homepractice.day1127;

import java.util.Arrays;

public class Arraythree {

    public static void main(String[] args) {
//        int[][][] array = new int[3][2][1];
//        array[0][0][0] = 1;
//        array[1][0][0] = 2;
//        array[2][0][0] = 3;
//        array[0][1][0] = 4;
//        array[1][1][0] = 5;
//        array[2][1][0] = 6;
        int[][][] array2 = {{{0, 1, 2}, {3, 4, 5}, {6,7,8}}}; //[1][3][3]
        for (int i = 0; i < array2.length; i++) {
            int [][] arra = array2[i];
            for (int j = 0; j < array2[i].length; j++) {
                int [] arr = arra[j];
                for (int k = 0; k < array2[i][j].length; k++) {
                    int ar = arr[j];
                    System.out.println(ar);
                }
            }
        }

    }
}
