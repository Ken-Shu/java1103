package com.Homepractice.OCA運算;

public class Test2 {

    public static void main(String[] args) {
        String[] xyz = {"x", "y", "z"};
        for (String ss : xyz) {
            int ii = 0;
            while (ii < xyz.length) {
                System.out.println(ss + " " + ii);
                ii++;
            }
        }
    }

}
