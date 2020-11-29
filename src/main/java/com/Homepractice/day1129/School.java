package com.Homepractice.day1129;

public class School {

    private Clazz[] clazz;

    public School() {
        clazz = new Clazz[]{
            new Student1("A", 80, 100),
            new Student2("B", 50, 60),};
    }

    public void print() {
        for (Clazz cl : clazz) {
            System.out.printf("姓名:%s , 數學 : %d , 英文: %d",
                    cl.getName(), cl.getMath(), cl.getEnglish());
        }
    }

}
