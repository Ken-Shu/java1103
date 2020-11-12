package com.ocp4;

import java.util.Random;

public class RandomNumber {

    //取的指定數量的隨機數
    public static int[] getRandomNumber(int amount) {
        Random r = new Random();
        int[] nums = new int[4];
        for (int i = 0; i < nums.length;) {
            int n = r.nextInt(9) + 1; //1~9隨機取值
            if (!isExist(nums, n)) {  //n值是否存在於nums陣列中?
                nums[i] = n;          //!isExist不存在
                i++; //確定可以放入i值才能++
            }
        }
        return nums;
    }

    public static boolean isExist(int[] nums, int n) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                return true;
            }
        }
        return false;
    }
}
