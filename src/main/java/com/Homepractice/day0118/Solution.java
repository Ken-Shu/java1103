/*
You are given an array of distinct integers arr and an array of 
integer arrays pieces, where the integers in pieces are distinct. 
Your goal is to form arr by concatenating the arrays in pieces in 
any order. However, you are not allowed to reorder the integers in 
each array pieces[i].

Return true if it is possible to form the array arr from pieces. Otherwise, 
return false.
*/

package com.Homepractice.day0118;

//arr{15,88}
//pieces{{88},{15}}

public class Solution {
   
    public boolean canFormArray(int[] arr, int[][] pieces) {
       
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < pieces[0].length; j++) {
              if(pieces[i][j] == arr[i])
                  return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] arr = {1,2,3};
        int [][] pieces = {{1},{2},{3}};
        System.out.println(solution.canFormArray(arr, pieces));
    }
}

