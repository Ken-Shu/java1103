package com.Homepractice.OCA建構子;

public class Test1 {
    public static void main(String[] args) {
        //Worker w = new Worker();
        Test1 t1 = new Test1();
        t1.lauch();
        Test1.Worker t = new Test1().new Worker();
        t.init();
    }
     class Worker{
        public void init(){
            System.out.println("Initialized");
        }
    }
    public void lauch(){                
        System.out.println("Launched");
    }
}
