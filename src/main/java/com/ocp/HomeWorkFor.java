package com.ocp;

public class HomeWorkFor {

    public static void main(String[] args) {
        int x = 10;  //列數
        int y = 5;   //排數
        for (int m = 1; m <= y; m++) {   //排數
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
