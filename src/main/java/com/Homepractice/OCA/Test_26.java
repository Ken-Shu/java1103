package com.Homepractice.OCA;

import java.util.ArrayList;
import java.util.List;

public class Test_26 {
    public static void main(String[] args) {
        List ps = new ArrayList();
        Instructor p2 = new Instructor("Jim");
        ps.add(p2);
        //int f = ps.indexOf(new Instructor("Jim"));
        int f =  ps.indexOf(p2);
        System.out.println(f);
        if(f>=0){
            System.out.println("Jim Found");
        }
    String str1 = "Collections of tutorials at tutorials point";
  
    // returns index of first character of the substring "tutorials" 
    System.out.println("index =  " + str1.indexOf("tutorials")); 
      
    // returns -1 as substring "admin" is not located
    System.out.println("index =  " + str1.indexOf("admin"));    
  
    }
    
}
class Instructor{
    String name;
    public Instructor(String name){
        this.name = name;       
    }
}