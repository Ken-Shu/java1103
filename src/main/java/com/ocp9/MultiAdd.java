package com.ocp9;

public class MultiAdd {

    //int ... nums 
    // ... 代表省略號 等於無限的 int
    public static void add(int ... nums) {
        int sum = 0;
        for ( int n : nums){
            sum += n;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        add();
        add(10);
        add(10, 20);
        add(10, 20, 30);
        add(10, 20, 30,40);
        add(10, 20, 30,40,50,60);
        add(10, 20, 30,40,50,60,70);
int [] nums = {10,20,30,40,50,60,70};
        add(nums);
    }
}
