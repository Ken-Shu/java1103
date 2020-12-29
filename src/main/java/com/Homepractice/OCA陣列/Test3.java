package com.Homepractice.OCA陣列;

public class Test3 {
    public static void main(String[] args) {
        int [][] arr = new int[2][];
        arr[0]=new int[3];
        arr[0][0]=11;
        arr[0][1]=22;
        arr[0][2]=33;
        arr[1]=new int [5];
        arr[1][0]=11;
        arr[1][1]=22;
        arr[1][2]=33;
        arr[1][3]=44;
        for (int[] ia :arr){
            for (int i : ia) {
                System.out.println(i);
            }
        }
    }
    
}
