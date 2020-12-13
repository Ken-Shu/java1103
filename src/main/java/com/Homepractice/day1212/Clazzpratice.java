package com.Homepractice.day1212;

public class Clazzpratice {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo2(d1);
        
    } 
        public static void Demo2(Demo d1){
            d1.name="小王";
            d1.year=20;
            d1.height=170;
            d1.print();
        }
    }
    
    
    
    class Demo {

        public String name;
        public int year;
        public int height;

        public void print() {
            System.out.println("姓名" + name + "年齡" + year + "身高" + height);
        }
    }

