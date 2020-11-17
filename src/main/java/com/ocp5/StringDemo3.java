
package com.ocp5;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = new String("Java");  //參考型別
        s1=s1.concat("8");//concat 字串連接
        System.out.println(s1);
        
        StringBuilder sb = new StringBuilder("Java"); //參考型別
        sb.append("8");//StringBuilder 字串連接用append
        
        System.out.println(sb);//sb.toString
        //如何比較s1與sb??
        System.out.println(s1.equals(sb)); //true
        System.out.println(s1.equals(sb.toString()));  //true
        System.out.println(s1.intern() == sb.toString().intern()); //true
        
    }
}
