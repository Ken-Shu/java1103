package com.Homepractice.OCA建構子;

public class Test_47 {

    public static void main(String[] args) {
        CIC c = new CIC();
    }
}
//會優先從父類別開始執行

class CIA {

    public CIA() {

        System.out.println("A");
    }
}

class CIB extends CIA {

    public CIB() {
        System.out.println("B");
    }
}

class CIC extends CIB {

    public CIC() {
        System.out.println("C");
    }
}
