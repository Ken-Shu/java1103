
package com.ocp;

public class HomeWorkStar {
    public static void main(String[] args) {
        int line = 5 ;
        //*        *  
        //**      **
        //***    ***
        //****  ****
        //**********
        for(int i = 1 ; i<=line ; i++ ){
            for( int y = 1 ; y <= i ; y ++)
            System.out.print("*");
        }
        System.out.println();
    }
 }
