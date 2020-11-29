package com.Homepractice.day1129;

public class Clazz {
String name;
private int math;
private int english;

    public Clazz() {
    }

    public Clazz(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Class{" + "name=" + name + ", math=" + math + ", english=" + english + '}';
    }


}
