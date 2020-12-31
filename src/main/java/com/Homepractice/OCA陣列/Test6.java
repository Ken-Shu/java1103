package com.Homepractice.OCA陣列;

public class Test6 {
    private  int i;
    void show(){
        while(i<=4){
            for(int i = 1 ; i<=4;){
                System.out.print(i+" ");
                i++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        new Test6().show();
    }
   
    
    
}
