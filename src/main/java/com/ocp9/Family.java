package com.ocp9;

class Father {
    //class Father extends Object{ // Java 物件最後都會繼承 Object

    public Father() {
        System.out.println("Father no money");
    }

    Father(int money) {
        System.out.println("Father's money =" + money);
    }
}

class Son extends Father { // 如果不寫繼承 預設繼承為Object

    public Son() {
        super(); //可以不用寫
        //super(10000);
    }
}

public class Family {

    public static void main(String[] args) {
        Son son = new Son();

    }
}
