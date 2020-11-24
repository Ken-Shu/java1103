package com.ocp7;

public class BookStore {
    public static void main(String[] args) {
     Book.publichName = "Microsoft";
        Book b1 =new Book(); 
        b1.setName("Java");
        b1.setPrice(100);
        b1.publichName="Oracle";
        Book b2 =new Book();
        b2.setName("VB");
        b2.setPrice(200);
        b2.publichName="IBM";
        Book b3 = new Book("Java",80);
        b3.publichName="Pcachool"; //共用類別由最後改的優先輸出
        System.out.println(b3);
        System.out.println(b1);
        System.out.println(b2);
    }
    
}
