package com.Pattern.observer;

//被觀察者(主題 , youtuber)
public interface Subject {
    void add(Observer observer); //加入訂閱
    void remove(Observer observer); // 取消訂閱
    void notifyObserver(String data); //發送通知
}
