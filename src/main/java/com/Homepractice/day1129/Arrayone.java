package com.Homepractice.day1129;

public class Arrayone {
    public static void main(String[] args) {
        int [][][] array={
            {{10},{11},{12}},{{13},{14},{15}}
        };//3.2.1
        for (int i = 0; i < array.length; i++) {
            int [][] arra = array[i];
            for (int j = 0; j < arra.length; j++) {
                int [] ara = arra[j];
                for (int k = 0; k < ara.length; k++) {
                    int ar = ara[k];
                    System.out.println(ar);
                }
            }
        }
    }
    
}
