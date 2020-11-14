
package com.Homepractice.day1114;

import java.util.Arrays;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        int []ans =RandomNumber2.getRandomNumber(5);
        System.out.println(Arrays.toString(ans));
        
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入五位數字:");
            String input =sc.next();
            
            int[]guess={input.charAt(0)-48,input.charAt(1)-48,input.charAt(2)-48,input.charAt(3)-48,input.charAt(4)-48};
            
            
            int b = 0;
            for (int i = 0; i < guess.length; i++) {
                for (int j = 0; j < ans.length; j++) {
                    if(guess[i]==ans[j]){
                        b++;
                    }
                }
            }
            int a = 0;
            for (int i = 0; i < guess.length; i++) {
                if(guess[i]==ans[i]){
                    a++;
                }
            }
            b=b-a;
            System.out.printf("%s:%dA  %dB\n",Arrays.toString(guess),a,b );
            if(a==4){
                System.out.println("恭喜答對了");
                break;
            }
                
            
        } while (true);
    }
}
