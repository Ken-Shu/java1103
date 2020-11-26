package com.Homepractice.day1124;

public class ClassRoom {
    private String name;
    private int english;
    private int math;    

    public ClassRoom(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public ClassRoom() {
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
    
    public void sum(String name,int math ,int english) {
        this.name =name;
        this.math=math;
        this.english = english;
        int sum = 0;
        sum = math +english;
        System.out.println(sum);
    }
    

    @Override
    public String toString() {
        String classname = getClass().getSimpleName();
        return "班級:" + "姓名=" + name + ", 英文=" + english + ", 數學=" + math  ;
    }
    
}