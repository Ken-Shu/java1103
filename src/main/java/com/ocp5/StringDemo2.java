
package com.ocp5;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 =new String("Java"); //new string 放置在 stack區
        String s2 = "Java"; // 此寫法放置在Heap區
        //s1=s1.intern();//intern()將字串移入到String pool
        s1=s2;//改變s1的指向位置
        System.out.println(s1==s2);
        //也可用:
        //System.out.println(s1.intern()==s2);
        System.out.println(s1.equals(s2)); //equals 只比較字串相同 不比較擺放區域
    }
}
