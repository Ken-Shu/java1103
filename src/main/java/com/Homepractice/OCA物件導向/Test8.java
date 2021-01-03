package com.Homepractice.OCA物件導向;

public class Test8 {
static int count = 0;
int i = 0;
public void updateCount(){
    while(i<5){
        i++;
        count++;
    }
}
    public static void main(String[] args) {
        Test8 t1 = new Test8();
        Test8 t2 = new Test8();
        t1.updateCount();
        t2.updateCount();
        System.out.println(t1.count+":"+t2.count);
    }
}
