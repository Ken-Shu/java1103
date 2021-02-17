package com.Homepractice.三元運算子;

public class Test {
    public static void main(String[] args) {
        String i = "Jim";
        //三元運算子 若比較出來為true 
        //則因為true 放在後方 所以答案為 後方之 NG
        if(i.equals("Jim")?false:true){
            System.out.println("OK");
        }else{System.out.println("NG");
        
        }
    }
    
}
