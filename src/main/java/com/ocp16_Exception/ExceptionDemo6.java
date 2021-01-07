package com.ocp16_Exception;

class Foo extends  RuntimeException{
    
}
class Bar extends  RuntimeException{
    
}
class Sub extends  Bar{
    
}

public class ExceptionDemo6 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (Foo | Bar e) {
        }
        //Sub 和 Bar 有繼承關西 所以不能用Exception
//        try {
//            System.out.println(10/0);
//        } catch (Sub | Bar e) {
//        }
        try {
            System.out.println(10/0);
        } catch (Foo | Sub e) {
        }
    }
}
