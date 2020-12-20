
package com.Homepractice.day1220.Stream;

import java.util.stream.Stream;

public class StreamPracticeString3 {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "C", "Visual Basic"};
        
        int sum = Stream.of(names).mapToInt(x -> x.length()).sum();
        System.out.println(sum);
        
        Stream.of(names).mapToInt(x -> x.length()).filter(x -> x>=4).forEach(System.out::println);
        
        
    }
    
}
