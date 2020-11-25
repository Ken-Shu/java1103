package com.Homepractice.day1125;

public class Mother {
    private String name;
    private int year;
    private String sex;

    public Mother(String name, int year, String sex) {
        this.name = name;
        this.year = year;
        this.sex = sex;
    }

    public Mother() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Mother負責:"+name+" "+year+"歲"+"性別:"+sex;
    }
    
}
