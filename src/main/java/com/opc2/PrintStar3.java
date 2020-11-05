package com.opc2;

public class PrintStar3 {

    public static void main(String[] args) {
        int x = 4;
        int y = 7;
        //*
        //**
        //***
        //***
        //***
        //**
        //*       
        for (int p = 1; p <= x; p++) {
            for (int m = 1; m <= p; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 7; i > x; i--) {
            for (int j = 4; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
