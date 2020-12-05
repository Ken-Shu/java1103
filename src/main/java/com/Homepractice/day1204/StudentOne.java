package com.Homepractice.day1204;

public class StudentOne extends Clazz {

    public String name;
    private int math;
    private int english;

    public StudentOne(String name, int math, int english) {
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
