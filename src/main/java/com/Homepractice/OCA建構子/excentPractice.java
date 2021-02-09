package com.Homepractice.OCA建構子;

public class excentPractice extends A1{
    int x = 100;
    public static void main(String[] args) {
        A1 a1 = new A1();
        System.out.println(a1.A2(1000));
    }
}
class A1{
    int x = 900;
public int A2(int x){
    this.x = x ;
    x =50;
    return x;
}    
}