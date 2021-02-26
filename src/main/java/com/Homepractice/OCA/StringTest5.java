package com.Homepractice.OCA;

public class StringTest5 {

    public static void main(String[] args) {
        StringBuilder msg = new StringBuilder("hello Jim!!");
        int loc = 0;
        try {
            for (loc = 0; loc < 12; loc++) {
                switch (msg.charAt(loc)) {
                    case 'i':
                    case 'e':
                    case 'o':
                        String ucs = Character.toString(msg.charAt(loc)).toUpperCase();
                        msg.replace(loc, loc+1 , ucs);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Out of Limits");
        }
        System.out.println(msg);
    }    
}
