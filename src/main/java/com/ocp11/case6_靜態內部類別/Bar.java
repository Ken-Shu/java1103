package com.ocp11.case6_靜態內部類別;

public class Bar {
int x = 100;
    public static class Foo {
        //靜態內部類別
        //可以有static 成員 與 instance(實體，物件)成員
        //static 必須 new Bar 才能呼叫 x
        public static void pintMe() {
            System.out.println("I am Foo");
        }
        //也可以放物件方法

        public void hello() {
            System.out.println("I am Foo");
        }
    }
        //一般內部類別
        //只能有 instance 成員
    public class Hoo {

        public void hello() {
            System.out.println("I am Foo");
        }
    }
}
