package com.ocp22_wait_notify;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cookie {

    private boolean empty = true; //盤子是否為空的 true = 空 false = 有東西

    //吃餅乾
    public synchronized void eat(int no) {
        //如果 發現 盤子是空的(true)則 拋出鑰匙給主人
        //主人放餅乾 反之 盤子有東西(false)則System.out小狗吃餅乾
        while (empty) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cookie.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String name = Thread.currentThread().getName();
        System.out.printf("%s 吃了第 %d 塊餅乾\n", name, no);
        empty = true;
        notifyAll(); //notifyAll 全部喚醒 用while 解決 not if
    }

    //放餅乾
    public synchronized void put(int no) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        String name = Thread.currentThread().getName();
        System.out.printf("%s 放了第 %d 塊餅乾\n", name, no);
        empty = false;
        notifyAll();
    }
}
