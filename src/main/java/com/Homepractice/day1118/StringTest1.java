package com.Homepractice.day1118;

public class StringTest1 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        System.out.println(s1==s2);
        s1=s1.concat(s2);
        System.out.println(s1);
        
    }
    
}
