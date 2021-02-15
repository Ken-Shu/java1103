
package com.Homepractice.OCA;

public class Test_14 {
    public static void main(String[] args) {
        int intArr[];
        intArr = new int [2];
        intArr[0]=100;
        intArr[1]=200;
        
        intArr = new int [4]; //上方同樣intArr 的變數會被覆蓋[0][1] 會變成0值
        intArr[2]=300;
        intArr[3]=400;
        for (int x : intArr) {
            System.out.println(" "+ x);
            
        }
        String id = "1234-5678-9012-3456";
        System.out.println(miskId(id));
     }   
  
//    StringBuilder str = new StringBuilder("admin"); //從0開始算 0=a 1=d 2=m...
//    System.out.println("string = " + str);
//
//    // prints substring from index 3
//    System.out.println("substring is = " + str.substring(3));
//    }
    public static String miskId(String id){
     String x = "0000-0000-0000-";
     StringBuilder sb =new StringBuilder(x);
    sb.append(id, 15, 19);//從 15 號位子(包含15號位子) 開始 到19號位子結束(不包含19號位子) 
    return sb.toString();
    }
}
