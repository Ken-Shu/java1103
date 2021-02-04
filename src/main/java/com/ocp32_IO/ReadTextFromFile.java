package com.ocp32_IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class ReadTextFromFile {
    public static void main(String[] args) {
        //注意 因為要 開檔案 寫檔案 還要關檔案 所以最後一定要 close
        File file = new File("src\\main\\java\\com\\ocp32_IO\\files\\data.txt");       
        //使用 try - with -resource 的語法
        //把要建立的物件 放入try 內 可樣就不用 close
        //主要是因為 writer 內有 close 的動作 所以可以放入try catch
        try (FileReader r = new FileReader(file)){ 
            int data = 0;
            String allData = "";
            while ((data = r.read()) != -1) { //把每次讀到的資料 放入 data 讀到 -1 表示沒資料了
                //System.out.print((char)data); //轉型成字串
                allData += (char)data;
            }
            System.out.printf("檔案內容: %s \n",allData);            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
