package com.ocp11.case5_匿名內部類別;

public class BMIMain {
    public static void main(String[] args) {
        //Java 7以前的寫法
        BMI bmi = new BMI() {
            @Override
            public double getBMIByHeightWeight(double height, double weight) {
           return weight/Math.pow(height/100,2);
            }
        };
        System.out.println(bmi.getBMIByHeightWeight(170, 60));
        
        //Java 8 Lambda
        // -> 要做甚麼
        BMI bmi2=(h,w)->w/Math.pow(h/100,2);
        System.out.println(bmi2.getBMIByHeightWeight(170, 60));
    }
    
}
