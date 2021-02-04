package com.ocp32_IO;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;  //{}jasonobject []jsonarray

public class OpenWeater {
    public static void main(String[] args) throws Exception{
        String id = "dbdd559ece9681a33845d41709506210";
        String cityname="taoyuan,TW";
        String urlstr = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";
        urlstr = String.format(urlstr,cityname,id);
        System.out.println(urlstr);
        //上方先拋出 錯誤 就不用 try catch
        URL url = new URL(urlstr);
        //網路上的東西是 inputStream
        InputStream is = url.openStream();
        //把 inputStream 轉成 Reader
        Reader r = new InputStreamReader(is);
        int data = 0;
        String jsonStr = "";
        while ((data = r.read()) != -1) {
           jsonStr += (char)data;            
        }
        System.out.println(jsonStr);
        //分析 Json 字串
        JSONObject root = new JSONObject(jsonStr);
        JSONObject main = root.getJSONObject("main");
        double temp = main.getDouble("temp")-273.15;
        double feels_like = main.getDouble("feels_like")-273.15;
        int humidity = main.getInt("humidity");
        int dt = root.getInt("dt");
        //------------------------------------------
        //世界時間
        Calendar calendar = Calendar.getInstance();
        TimeZone tz =TimeZone.getDefault();
        calendar.add(Calendar.MILLISECOND,tz.getOffset(calendar.getTimeInMillis()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.getDefault());
        java.util.Date currentTimeDate = new java.util.Date((long)1612443792 *1000);
        //-----------------------------------
        System.out.printf("目前溫度:%.2f\n",temp);
        System.out.printf("體感溫度:%.2f\n",feels_like);
        System.out.printf("目前濕度:%d %% \n",humidity); //若要顯示百分比 則打兩次%%
        System.out.printf("發布時間: %s \n",sdf.format(currentTimeDate));
    }
}
