package com.Homepractice.day1124;

public class ClassRoom {
    private String name;
    public int english;
    public int math;

    public ClassRoom() {
    }

    

    public ClassRoom(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "班級:"+name+ "英文"+english+"數學"+math;
    }
    
}
