
package com.Homepractice.day0116;

class Teacher extends Thread{

    @Override
    public void run() {
        System.out.println("(今天禮拜日)");
        System.out.println("禮拜一要交作業");
        Student s1 = new Student();
        s1.start();
        try {
            s1.join(10_000);
        } catch (InterruptedException e) {
        }
        System.out.println("寫完了");
    }        
}

class Student extends Thread{

    @Override
    public void run() {
        System.out.println("學生開始寫作業");
        for (int i = 0; i <= 8; i++) {
            System.out.printf("經過時間 %d 小時\n",i);
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                System.out.println("不想寫了");
                return;
            }
        }
    }
    
}

public class Thread1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.start();
    }
}
