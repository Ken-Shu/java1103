package com.Homepractice.day1124;



public class School {
    public static void main(String[] args) {
        ClassRoom [] classRooms ={
            new Student1("156", 80, 100),
            new Student2("188",90,60)
        };
        System.out.println(classRooms);
        System.out.println(classRooms[0]);
        System.out.println(classRooms[1]);
      
       
       //int sum = 0;
        for(ClassRoom classRoom:classRooms){
           //sum+=classRoom.getEnglish();
           classRoom.sum("156", 80, 100); ;
        }
        //System.out.println(sum);
    }
}