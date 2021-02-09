package com.Homepractice.OCA建構子;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Test_45 {
class Student{
    int id ;
    String name;
    List courses = new ArrayList();
    Student(int i ,String name , List cs){       
    }
    public String toString(){
        return id + " : " + name + " : "+ courses;
    }     
} 
    public static void main(String[] args) {
        List cs = new ArrayList();
        cs.add("Java");
        cs.add("English");
        Student s= new Test_45().new Student(1,"Jim",cs);
        System.out.println(s);
        
    }
}
