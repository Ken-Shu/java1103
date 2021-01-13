package com.Homepractice.day0113;

public class Clazz {
String name;
int math;
int english;

public void getscore(String name,int math , int english){
this.name = name;
this.math = math;
this.english = english;    
 }
public int sum(){
    int sum = 0;
    sum=math+english;
    return sum;
}
public void print(){
    System.out.println("姓名: "+name+" 數學: "+math+"英文: "+english+"總分: "+sum());
}
}