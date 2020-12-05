package com.Homepractice.day1204;

public class Parent {

    public static void main(String[] args) {
        Techer tc = new Techer();
        School [] schools = tc . getschools();
        tc.print(schools);
        int summath = tc.getmath(schools);
        System.out.println(summath);
        int sumenglish =tc.getenglish(schools);
        System.out.println(sumenglish);
    }
}
