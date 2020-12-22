package com.Homepractice.day1221.Stream;

import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        String [] nums = {"Java" , "Python" ,"C" ,"Visual Basic" };
        //印出陣列內容
        Stream.of(nums).forEach(System.out::println);
        //陣列字數總和
        int sum =Stream.of(nums).mapToInt(x->x.length()).sum();
        System.out.println(sum);
        //印出陣列個別字數
        Stream.of(nums).mapToInt(String::length).forEach(System.out::println);
        //印出小於4個字數支陣列內容
        Stream.of(nums).filter(x -> x.length()<=4).forEach(System.out::println);
        //印出小於4個字數之陣列字數總和
        int sum2 = Stream.of(nums).mapToInt(String::length).filter(Until::print).sum();
        System.out.println(sum2);
    }
}
