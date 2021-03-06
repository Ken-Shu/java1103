package com.opc2;

public class Account {

    String name; // 戶名
    private int balance; // 餘額
    // private 私有的變數(存取權限) 
    //存款

    void setBalance(int money) {
        if (money >= 0) {
            balance += money;  // balance 連加(+=) money
            System.out.printf("存款 %d 成功 ! \n", money);
        } else {
            System.out.printf("存款 %d 失敗:(存款金額必須大於0)! \n", money);
        }
    }

    //提款
    void withdraw(int money) {
        if (money > 0 && balance >= money) {
            balance -= money; //balance 連減(-=) money
            System.out.printf("提款 %d 成功 !\n", money);
        } else {
            System.out.printf("提款 %d 失敗:(提款金額必須大於0或餘額不足)!\n", money);
        }
    }

    // 印出帳戶餘額
    void printBalance() {
        System.out.printf("name: %s , balance: %d\n", name, balance);
    }
    // 轉帳
    void transfer(int money , Account ac){
        if(money>0 & balance>=money){
            withdraw(money);
            ac.setBalance(money);
        }
    }
}
