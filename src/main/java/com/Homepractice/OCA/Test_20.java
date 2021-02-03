
package com.Homepractice.OCA;


public class Test_20 {
    public static void main(String[] args) {
        SuperTest r = new SuperTest();
        //System.out.println(method1());
        System.out.println(r.method2());
    }    
}
class SuperTest{
    private static final int MAX = 99;
    private int method1(){
        int a = 1001+MAX;
return a;
    }
    int method2(){
        int a = 2001+MAX;
        return a;
    }
}
