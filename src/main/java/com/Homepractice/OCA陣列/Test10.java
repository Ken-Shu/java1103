package com.Homepractice.OCA陣列;

public class Test10 {
    public static void main(String[] args) {
        String [] abcd = {"a","b","c","d"};
        for (int i = 0; i < abcd.length; i++) {
            System.out.println(abcd[i]+" ");
            if(abcd[i].equals("a")){
                continue;
            }
            System.out.println("Over");
            break;
        }
    }
    
}
