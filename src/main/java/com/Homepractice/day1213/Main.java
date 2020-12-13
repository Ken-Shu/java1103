package com.Homepractice.day1213;

public class Main {
    public static void main(String[] args) {
        Store st = new Store();
        Animal [] animals = st.animals();
        System.out.println(st.allPrice(animals));
        st.print(animals);
    }
    
}
