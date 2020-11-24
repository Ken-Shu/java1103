package com.Homepractice.day1121;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
    int [] ar = {90,80,70,60};
    int [][] ar2={{91,92,93,94},{95,80,70,60}};
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2[0]));
        System.out.println(Arrays.toString(ar2[1]));
        if(ar.length==ar2[0].length){
            System.out.println(Arrays.toString(ar2[1]));
        }
    }  
}
