package com.Homepractice.day1124;

public class School {
    public static void main(String[] args) {
        ClassRoom [] classRooms ={
            new Student1("123", 100, 80),
            new Student2("235", 80, 60)
        };
        System.out.println(classRooms);
        System.out.println(classRooms[0]);
        System.out.println(classRooms[1]);
        int sum = 0;
        for(ClassRoom classRoom:classRooms){
            System.out.println(classRoom);
            sum+=classRoom.getEnglish();
            sum+=classRoom.getMath();
        }
        System.out.println(sum);
    }
}