
package com.Homepractice.OCA陣列;

class Test1 {
    public static void main(String[] args) {
        int [] arr2[] = {{-1},{0,1},{0,2,4},{0,3,6,9},{0,4,8,12,16}};
        System.out.println(arr2[3][1]+" ");
        System.out.println(arr2[3][1]);
        //arraycopy
        int [][] arr1 = {{10,20},{30,40,50},{60,70}};
        //(起始目標 , 起始陣列相對位置 , 終點目標 , 終點陣列相對位置 , 預複製之長度{})
        System.arraycopy(arr2, 2, arr1, 0, 3);
        for (int i = 0; i < arr1.length; i++) {
            for(int j = 0; j<arr1[i].length;j++){
                System.out.println(arr1[i][j]);
            }
        }
    }
    
}
