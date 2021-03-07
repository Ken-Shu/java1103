
package com.Homepractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleTime {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   java.util.Date now = df.parse("2004-03-26 13:31:40");
   java.util.Date date=df.parse("2004-01-02 11:30:24");
   long l=now.getTime()-date.getTime();
   long day=l/(24*60*60*1000);
   long hour=(l/(60*60*1000)-day*24);
   long min=((l/(60*1000))-day*24*60-hour*60);
   long s=(l/1000-day*24*60*60-hour*60*60-min*60);
   System.out.println(""+day+"天"+hour+"小時"+min+"分"+s+"秒");
    }
    
}
