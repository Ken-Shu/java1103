
package com.Homepractice.day1115;

public class ArrayTry {
    public static void main(String[] args) {
        int [] array1 = new int[10];
        array1 [0]=50;
        array1 [1]=50;
        array1 [2]=50;
        array1 [3]=50;
        array1 [4]=50;
        array1 [5]=50;
        array1 [6]=50;
        array1 [7]=50;
        array1 [8]=50;
        array1 [9]=50;
        System.out.println(Sum(array1));
        
    }
    public static int Sum(int[] array) {
        int sum = 0;
        for (int i = 0; i <array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }
}
