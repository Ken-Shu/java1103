package com.Homepractice.day1220.Stream;

import java.util.stream.IntStream;

public class StreamPracticeArray {
    public static void main(String[] args) {
        int [] sum = {100,80,60,40};
        
        int sum2 = IntStream.of(sum).filter(x -> x>=60).sum();
        System.out.println(sum2);
    }
    
}
