package com.Homepractice.OCA;

public class StringTest2 {
    public static void main(String[] args) {
        String s = "123";
        if(s.length()>2)
        s = s.concat("456");
       for (int i = 0; i < 3; i++) {
            s+="z";
            System.out.println(s);
        }
    }
}  
//concat 必須寫在sout內
