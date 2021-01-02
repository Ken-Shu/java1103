package com.Homepractice.OCA物件導向;

public class Test3 {
private double radius;
static final  double PI=1.1415926;
public void setRadius(double r){
    this.radius=r;
}
public double getAres(){
    return this.radius * this.radius *PI;
}
public static double areaFormula(double r){
    return r*r*PI;
}
    public static void main(String[] args) {
        System.out.println(Test3.PI);
        System.out.println(Test3.areaFormula(1));
        
    }
}
