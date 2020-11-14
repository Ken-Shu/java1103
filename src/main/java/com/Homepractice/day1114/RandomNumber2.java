package com.Homepractice.day1114;

import java.util.Random;

public class RandomNumber2 {

    public static int[] getRandomNumber(int amount) {
        Random r = new Random();
        int[] nums = new int[4];
        for (int i = 0; i < nums.length;) {
            int n = r.nextInt(9) + 1;
            if (!RandomNumber.getBMIboolean(nums, n)) {
                nums[i] = n;
                i++;
            }
        }
        return nums;
    }
}