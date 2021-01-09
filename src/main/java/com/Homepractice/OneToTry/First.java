
package com.Homepractice.OneToTry;


public class First {
    public long getHash(){
        return 222;
    }
    public static void main(String[] args) {
        //First f2 = new Second();
        //First f3 = new Third();
        First  f1, f2 , f3;
        f1 = new First();
        f2 = new Second();
        f3 = new Third();
        System.out.println(f1.getHash());
        System.out.println(f3.getHash());
        System.out.println(f2.getHash());
    }
}
