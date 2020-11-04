package com.ocp;

public class HomeWorkWhile {

    public static void main(String[] args) {
        int x = 10;  //排數
        int y = 5;   //行數
        for (int m = 1; m <= y; m++) {   //行數
           for ( int p = 1 ; p<=m ; p++ ){
               System.out.print("*");
           }
           for (int speac = 1 ; speac <=x-( m*2); speac++){
               System.out.print(" ");
           }
           for (int r = 1; r <= 1 ; r ++ ){
               for( int t = 1; t<=m ; t++){
                   System.out.print("*");   
               }
           }
        System.out.println();
        }
    }
}
