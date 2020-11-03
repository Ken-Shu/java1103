package com.ocp;

public class HomeWorkStar {

    public static void main(String[] args) {
        int line = 5;
        int speac = 4;
        //*        *   i*x  8 
        //**      **        6
        //***    ***        4
        //****  ****        2
        //**********        0
        for (int i = 1; i <= line; i++) {    // 變數1 行數
            for (int y = 1; y <= i; y++) {   //星星數
                System.out.print("*");
            }
            for (int x = 1; x<=line ; x++) {    //空格1
                for(int z = 4; z<=speac ; z++){
                
                    System.out.print(" ");
            }
            }

        
        System.out.println();
}
    }
}
