
package com.Homepractice.LeetCode;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverse(-123));
    }
    public int reverse(int x) {
        long result = 0;
        
        do {
            result *= 10;
            result += (x % 10);
            x /= 10;
        } while (x != 0);
        
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0;
        else
            return (int)result;
    }

}
