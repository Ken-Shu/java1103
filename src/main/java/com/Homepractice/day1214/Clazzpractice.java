package com.Homepractice.day1214;

public class Clazzpractice {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice2(d1);
    }

    public static void Dice2(Dice d1){
    int sum=0;
        d1.name ="小名";
    d1.math =50;
    d1.english =100;
    d1.print();
    sum=(d1.math+d1.english);
        System.out.printf("總分:%d\n",sum);
}
    
}
class Dice{
    public String name;
    public int math;
    public int english;
    public void print(){
    System.out.println("姓名"+name+"數學"+math+"英文"+english);
}    
}
