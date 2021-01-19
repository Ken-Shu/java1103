package com.Homepractice.day0119;

public class TryCatch {
    public static void main(String[] args) {
         String Num = "123";
        String notNum = "456a";
        try {
            Integer.parseInt(Num);
            System.out.println("是數字");
        } catch (java.lang.NumberFormatException e) {
            System.out.println("不是數字");
        }
        try {
            Integer.parseInt(notNum);
            System.out.println("是數字");
        } catch (java.lang.NumberFormatException e) {
            System.out.println("不是數字");
        }
    }
    
}
