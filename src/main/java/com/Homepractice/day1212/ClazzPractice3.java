package com.Homepractice.day1212;

public class ClazzPractice3 {

    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice2(d1);
        
        
        
    }
    public static void Dice2(Dice d1) {
        d1.name = "小名";
        d1.english = 50;
        d1.math = 100;
        d1.print();
    }
}

class Dice {

    public String name;
    public int english;
    public int math;

    public void print() {
        System.out.println("姓名" + name + "英文" + english + "數學" + math);
    }

}


