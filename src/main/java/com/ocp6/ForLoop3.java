package com.ocp6;

public class ForLoop3 {

    public static void main(String[] args) {
        int[][][] nums = 
            {{{100, 90}, {80, 70}, {60, 50}},
            {{70, 90}, {80, 100}, {90, 90}}}; //2.3.2
        //求所有數字的總和:
        
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int [][] num1=nums[i];
            for (int j = 0; j < nums[i].length; j++) {
                int []nu = num1[j];
                for (int k = 0; k < nums[i][j].length; k++) {
                    int n = nu[k];
                    System.out.println(n);
                    sum1 += n;
                }
            }                       
             }
        System.out.printf("sum=%d\n",sum1);
                
         
        //求所有數字總和
        int sum = 0;
        for (int[][] num : nums) {
            for (int[] nu : num) {
                for (int n : nu) {
                    System.out.println(n);
                    sum += n;

                }
            }
        }
        System.out.println(sum);
    }

}
