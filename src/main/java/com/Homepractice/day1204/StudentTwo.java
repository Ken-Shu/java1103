package com.Homepractice.day1204;

public class StudentTwo extends Clazz{
    
   public String name;
    private int math;
    private int english;

    public StudentTwo(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public String name() {
        return name;
    }

    public int getmath() {
        return math;
    }

    public int getenglish() {
        return english;
    }

    
}
