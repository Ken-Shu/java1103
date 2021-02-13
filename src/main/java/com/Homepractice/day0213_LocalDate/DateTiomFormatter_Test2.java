
package com.Homepractice.day0213_LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTiomFormatter_Test2 {
    public static void main(String[] args) {
        try {
        String date = LocalDate.parse("2016-05-05").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
