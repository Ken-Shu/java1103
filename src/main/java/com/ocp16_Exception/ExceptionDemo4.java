package com.ocp16_Exception;

public class ExceptionDemo4 {
    public static void main(String[] args) {
       //foo 必須使用 try catch 或 throws 才能拋出
       //bar 直接使用即可
    }
    // 受檢例外 exception 必須用 try catch 才能執行
    public static void foo() throws Exception{ //checked exception
        System.out.println("foo");
    }
    // 非受檢例外 可直接用main方法執行 僅 Error 或 RuntionException
    public static void bar() throws RuntimeException{ //Unchecked exception
        System.out.println("bar");
    }
}
