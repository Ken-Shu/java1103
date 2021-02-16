package com.Homepractice.三元運算子;

public class Test {
    public static void main(String[] args) {
        String i = "Jim";
        //三元運算子 若比較出來為true 則 帶入冒號左方
        //因為左方為 false 則答案為 else 後面
        if(i.equals("Jim")?false:true){
            System.out.println("OK");
        }else{System.out.println("NG");
        
        }
    }
    
}
