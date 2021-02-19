
package com.Homepractice.OCA;

public class Test_12 {
    static boolean bol;
    static char cha;
    private char c;
    private  int i;
    public static void main(String[] args) {
        System.out.println(30+5==5+31);
        //Debug file Variables Alt+Shift+1
        int w = -10;
        int x = 17;
        int a = ++w; // -10+1 = -9   ,   a = w
        int b = x--; //b = x   , x = (17-1)=16 此時 b = 17 x 則變成 16
        a++; // a= (-9+1) = -8
        b--; // b = 16
        System.out.println(a+" , "+b);
        //boolean 預設值為 false ||  char 預設值為 空值
        System.out.println("boolean: "+bol + "   char"+ cha +" ! ");
        //在sout 內 數字皆為運算
        //但是如果()內有字串 則 + 號則不會變成運算子
        System.out.println("Output"+2+3+4);
        System.out.println(3+1);
        System.out.println(3+6*9-4);
        System.out.println((3+6)*9-4);
        System.out.println(3+(6*9)-4);
        System.out.println(3+6*(9-4));
        System.out.println((3+9*9)-4);
        
        
        int ii = 100;
        float ff = 100.00f;
        double dd = 100;
        //不能整數跟小數之間互換 或者 把大丟給小 double>float
        //ii = ff ;
        //ff = dd;
        //ii = dd;
        dd = ff;
        
        try {
            String s = "Hello Java!";
        System.out.println(s.charAt(10));
        } catch (Exception e) {
           e.printStackTrace();
           
        }
        
        String h = "Hat";
        h.toLowerCase();
        System.out.println(h.substring(1,2));
        
        //因為 v1 跟 v2 各為自己定義一個char 型別 所以兩者沒有共用 各有自己的物件
        char v1 = 'a';
        char v2 = v1;
        v2='e';
        System.out.println(v1+" , "+v2);
        
        //因為t12_2沒有另外new 一個新物件 所以變數跟 t12 是共用的 最後 t12_2改變 等於 t12 也會改變
        Test_12 t12 = new Test_12();
        Test_12 t12_2 = t12;
        t12.c='i';
        t12_2.c = 'o';
        System.out.println(t12.c+" , "+t12_2.c);
        
        Test_12 one = new Test_12();
        Test_12 two = one ;
        one.i=10;
        two.i = 20;
        System.out.println(one.i+" , "+two.i);
        
        //-------------------------------------------
        String s1 ="Duke";
        char str2[]={'D','u','k','e'};
        String s3 = ""; //經過for迴圈 會形成nullDuke 會回傳NO 反之 若輸入""空值 則答案會變成 YES
        for(char c : str2){
            s3 = s3+c;
        }
        if(s3.equals(s1)){
            System.out.println("YES");
        }else System.out.println("NO");
        
       Integer iObj = new Integer(10);
       int i = 10;
        chandeVal(iObj++, i++);
        System.out.println(iObj+" , "+i);
    }
   static void chandeVal(Integer iObj , int i ){
            iObj=40;
            i=40;
        }
}
