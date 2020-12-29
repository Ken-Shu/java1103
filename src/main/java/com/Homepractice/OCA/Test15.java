package com.Homepractice.OCA;

public class Test15 {
    public static void main(String[] args) {
        String s1 ="Duke";
        String str2[] ={"D","u","k","e"};
        String s3 =null;
        for(String c : str2){
            s3 = s3+c;
        }
        if(s3.equals(s1)){
            System.out.println("YES");
        }else System.out.println("NO");
    }
    
}
