package com.Homepractice.day1215;

public class Classprcatice2 {
    public static void main(String[] args) {
        Dice3 d3 = new Dice3();
        Dice4(d3);
        
    }

public static void Dice4(Dice3 d3){
    d3.name = "阿明";
    d3.math=50;
    d3.english=100;
    d3.history=90;
    d3.sum = d3.math+d3.english+d3.history;
    d3.print();
}
}
class Dice3{
    public String name;
    public int math;
    public int english;
    public int history;
    public int sum;
    public void print(){
        System.out.println("名稱:"+name+"數學:"+math+"英文"+english+"歷史"+history);
        System.out.println("總分:"+sum);
    }
}

 

