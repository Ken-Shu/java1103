package com.Homepractice.OCA物件導向;

public class SampleClass {
    public static void main(String[] args) {
        AnotherSampleClass  asc = new AnotherSampleClass();
        SampleClass sc = new SampleClass();
        sc = asc;
        System.out.println("sc :"+sc.getClass());
        System.out.println("asc : "+ asc.getClass());
    }
  //SampleClass 在此處為 SampleClass
}
class AnotherSampleClass extends SampleClass{
}
//SampleClass 父類別
//AnotherSampleClass 子類別

