package com.ocp11.case4_方法內部類別;

public class Bar {
    
    public void hello(){
        //在Java8 之後 就可以不用加final
        //若x為final(不可變更)則可以給方法(void)內部類別使用
        //若x不為final(有使用)則系統認定為(一般變數不為final)
        //就不能給(void)方法內部類別使用
        int x = 100; 
        //x++;
        //void(方法)自己new
        class Foo{
            void printMe(){
                System.out.println("I am Foo");
                //若要存取hello()外部方法的區域變數
                //則該變數必須是final(不改變的值)
                System.out.println(x);
            }
        }
        Foo foo = new Foo();
        foo.printMe();
    }
}
