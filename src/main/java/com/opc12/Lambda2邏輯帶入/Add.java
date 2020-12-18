package com.opc12.Lambda2邏輯帶入;

//如果interface內有兩個方法 則FunctionalInterface會報錯
@FunctionalInterface
public interface Add {

    int sum(int x, int y);
//FunctionalInterface
    //只有一個方法
    //除了 公用方法 and default 方法
    public int hashCode(); //公用方法
    default void copyright(){ //default 有實作方法
        
    }
}
