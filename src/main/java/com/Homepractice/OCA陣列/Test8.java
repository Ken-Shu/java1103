package com.Homepractice.OCA陣列;

public class Test8 {

    public static void main(String[] args) {
        String [][] ss ={{"a","b","c"},{"d","e"}};
        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < ss[i].length; j++) {
                System.out.println(ss[i][j]+" ");
                if(ss[i][j].equals("a")){
                    break;
                }
            }
            continue;
        }
    }

}
