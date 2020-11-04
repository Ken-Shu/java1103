package com.ocp;

public class HomeWorkStar {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        //*        *   i*x  8   1  3  5  7  9
        //**      **        6
        //***    ***        4
        //****  ****        2
        //**********        0
        for (int i = 0; i < 5; i++) {    // 變數1 行數
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 14; j > i * 2 - 1; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
