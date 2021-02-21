
package com.Homepractice.OCA;

public class StringTest4_11 {
    public static void main(String[] args) {
        String s = "Hat";
        s.toLowerCase();
        s = s.concat("HAT".toLowerCase());
        //System.out.println(s.substring(4,6));
        System.out.println(s);
          
        
        Employee p1 = new Employee(99, "Duke");
        Employee p2 = new Employee(99, "Duke");
        Employee p3 = p2;
        boolean ans1 = (p2 == p3);
        boolean ans2 = p1.name.equals(p2.name);
        System.out.println(ans1+" , "+ans2);
    }        
}
class Employee{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }    
}