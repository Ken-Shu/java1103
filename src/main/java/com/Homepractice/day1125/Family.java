package com.Homepractice.day1125;

public class Family {
    public static void main(String[] args) {
        Father father = new Father("王", 5, "男");
        Mother mother = new Mother("簡", 10,"女");
        System.out.println(father);
        System.out.println(mother);
        int year = 0;
        year +=father.getYear();
        year +=mother.getYear();
        System.out.println(year);
    }
}
