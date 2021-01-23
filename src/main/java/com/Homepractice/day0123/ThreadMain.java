package com.Homepractice.day0123;

public class ThreadMain {
    public static void main(String[] args) {
        
        ThreadExcutor tex = new ThreadExcutor();
        tex.execute(new RunnableTest());
        
    }
    
}
