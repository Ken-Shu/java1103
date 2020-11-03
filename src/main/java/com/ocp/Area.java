
package com.ocp;

public class Area {
    int w;
    int h;
    //第一種方法
    void calcAndPrint(){
        int sum= w*h;
        System.out.println(sum);
    }
    //第二種方法
     int calcNotPrint(){
        int sum= w*h;
        return sum;
     }
}
