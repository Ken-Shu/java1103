package com.ocp11.case6_靜態內部類別;

public class Main {
    public static void main(String[] args) {
        //因為Foo是static 所以new Bar.Foo(); Bar後面不用加()
        Bar.Foo foo = new Bar.Foo();
        foo.pintMe();
    }
    
}
