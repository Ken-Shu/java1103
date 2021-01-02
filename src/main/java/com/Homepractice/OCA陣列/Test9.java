
package com.Homepractice.OCA陣列;

public class Test9 {
    public static void main(String[] args) {
        String strArr[][]=new String [2][2];
        strArr[0][0]="A";
        strArr[0][1]="B";
        strArr[1][0]="C";
        strArr[1][1]="D";
        for (int index = 0; index < 2;) {
            for (int idx = 0; idx < 2; ) {
                System.out.println(strArr[index][idx]+" : ");
                idx++;
            }
             index++;
        }
        
    }
    
}
