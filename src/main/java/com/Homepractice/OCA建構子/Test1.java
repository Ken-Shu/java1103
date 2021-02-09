package com.Homepractice.OCA建構子;

public class Test1 {
    public static void main(String[] args) {
        //Worker t = new Worker();
        Test1 t1 = new Test1();
        t1.lauch();
        Test1.Worker t = new Test1().new Worker();
        t.init();
        printHA();
        t1.printHAHA();
    }
    // 沒加上static 屬於 Test1 類別內的 Worker 類的 init
    // 所以要new 兩個物件 才可讀取init
    // 如果是 static class Worker 則只需要 new Worker()
     class Worker{
        private void init(){
            System.out.println("Initialized");
        }
    }
     //屬於Test1 內的物件
    public void lauch(){                
        System.out.println("Launched");
    }
    static void printHA(){
        System.out.println("HAHAHAHA");
}
    void printHAHA(){
        System.out.println("HAHAHAHAHAHAHA");
    }
}
