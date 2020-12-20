
package com.Homepractice.day1220.Stream;

import java.util.stream.Stream;

public class StreamPracticeString2 {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "C", "Visual Basic"};
        Stream.of(names).filter(x -> x.length()>=4).forEach(System.out::println);
    }
    
}
