
package com.Homepractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTest {
    public static void main(String[] args) {
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        
       Date d2 = new Date();
        String Star = simple.format(d2);
        try {
            System.out.println(Star);
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        Date d1 = new Date();
        String End = simple.format(d1);
        System.out.println(End);
        try {
            long diff = simple.parse(End).getTime()- (simple.parse(Star).getTime());
            System.out.println(diff);
        } catch (Exception e) {
        }
        
        
    }
    
}
