package com.ocp6;

public class ForLoop {
    public static void main(String[] args) {
        int [] scores = {100,90,80};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        //Enhanced for-loop  (enhanced增加集合/陣列)
        //只能往下讀取
        //無法改變內容
        //簡化存取
        for(int s:scores){ //for (型別 名稱 : 母體集合) 
            System.out.println(s);
        }
    }
}
