package com.Homepractice.day0123;

public class RunnableTest implements Runnable{
    private int x = 5;

    @Override
    public void run() {
        Monster monster = new Monster();
        int mhp = monster.hp();
        int z = this.x+5;
        int mz = mhp-monster.atk();
        //若要扣除血量 則另外建立一個血量物件
        System.out.println(z);
        System.out.println(x);
        System.out.println(monster.atk());
        System.out.println(mz);
        System.out.println(monster.hp());
        System.out.println(mz-monster.atk());
    }
    
}
