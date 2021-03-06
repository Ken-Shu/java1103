package com.ocp17_gc;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class Student {
    String name;

    //Thread 執行緒 currentThread 尋找使用之執行緒
    public Student(String name) { //建構子
        System.out.println(Thread.currentThread().getName()+ "執行建構子");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {  //解構子
        System.out.println(Thread.currentThread().getName()+ "執行解構子");
        System.out.println(name +"離開(被 GC 吞吃)");
    }
    
    

    @Override
    public String toString() {
        System.out.println(Thread.currentThread().getName()+ "toString");
        return "\nStudent{" + "name=" + name + '}';
    }
    
}

public class Classroom {
    public static void main(String[] args) {
        Faker faker = new Faker();
        List <Student>students =  new ArrayList<>();
        for(int i = 0; i< 10 ; i++){
            students.add(new Student(faker.name().lastName()));
        }
        System.out.println(students);
        //移除有 s 的人名  Iterator 走訪器
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if(student.name.contains("s") || student.name.contains("S")){
                iter.remove();
                student = null;
                System.gc();
            }
            
        }
        System.out.println(students);
    }
}
