package com.Homepractice.day1214;

public class Clazzpractice2 {
    public static void main(String[] args) {
        Dice3 d4 = new Dice3();
        Dice4(d4);
    }

public static void Dice4(Dice3 d1){
    d1.name="小王";
    d1.math=50;
    d1.english=80;
    d1.sum=(d1.math+d1.english);
    d1.print();
}
}
class Dice3{
    public String name;
    public int math;
    public int english;
    public int sum;
    public void print(){
        System.out.println("姓名:"+name+"數學:"+math+"英文:"+english+"總分:"+sum);
    }
} 