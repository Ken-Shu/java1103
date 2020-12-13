package com.Homepractice.day1212;

public class ClazzPartice2 {
    public static void main(String[] args) {
        play p1 = new play();
        play2(p1);
        
        
    }
    public static void play2(play play){
        play.name="小名";
        play.math=50;
        play.english=60;
        play.print();
    }
}   

class play{
   public String name;
   public int math;
   public int english;
   
   public void print(){
            System.out.println("姓名"+name+"英文"+math+"英文"+english);
   }
}
    

