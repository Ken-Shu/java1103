package com.Homepractice.day1220.Stream;

import java.util.stream.Stream;

public class StreamPracticeString {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "C", "Visual Basic"};
        Stream.of(names).forEach(System.out::println);
    }
    
}
