package com.Homepractice.OCA運算;

public class Test5 {

public static void update(int ...arr){
    for(int idx = 0; idx < arr.length ; idx ++){
        arr[idx] = arr[idx]+1;        
    }
}
    public static void main(String[] args) {
        int [] arr = {10,20,40};
        update(arr);
        for(int x : arr){
            System.out.println(x+", ");
        }
        update(arr[0],arr[1],arr[2]);
        System.out.println(arr[0]+", "+arr[1]+", "+arr[2]);
    }
}
