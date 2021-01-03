package com.Homepractice.OCA物件導向;

public class Test7 {
    public static void updateArr(int [] arr) {
        for (int pos = 0; pos < arr.length; pos++) {
            arr[pos] = arr[pos]+1;
        }
    }
    public static void main(String[] args) {
        int[]arr ={11,22,33};
        updateArr(arr);
        for (int x: arr){
            System.out.println(x+", ");
        }
        //updateArr(arr[0],arr[1],arr[2]);
        //System.out.println(array.toString());
    }
}
