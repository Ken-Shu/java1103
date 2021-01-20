package com.Homepractice.day0118;

public class Accound {

    private static int money;

    public Accound(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public synchronized void withdraw(int x) {
        String name = Thread.currentThread().getName();
        System.out.printf("%s 近來提款了\n", name);

        int temp_money = getMoney();

        for (int i = 1; i < 999999; i++);

        if (temp_money >= x) {
            setMoney(temp_money - x);
            System.out.printf("%s 提款 %d 成功 ,帳戶餘額 : %d \n", name, x, getMoney());
        } else {
            System.out.printf("%s 提款 %d 失敗 ,帳戶餘額 : %d \n", name, x, getMoney());
        }

        System.out.printf("%s 完成提款了\n", name);

    }
}
