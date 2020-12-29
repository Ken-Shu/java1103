package com.Homepractice.OCA;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Java";
        String [] s2 ={"J","a","v","a"};
        String s3 ="";
        for(String s : s2){
            
            s3 = s3+s;
        }
        
        boolean b1 =(s1 == s3);
        boolean b2 =(s1.equals(s3));
        System.out.println(b1);
        System.out.println(b2);
    }
    
}
