package com.ocp32_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WriteTextIntoFile2 {
    public static void main(String[] args) {
        //注意 因為要 開檔案 寫檔案 還要關檔案 所以最後一定要 close
        File file = new File("src\\main\\java\\com\\ocp32_IO\\files\\data.txt");       
        //使用 try - with -resource 的語法
        //把要建立的物件 放入try 內 可樣就不用 close
        //主要是因為 writer 內有 close 的動作 所以可以放入try catch
        try (FileWriter fw = new FileWriter(file ,true)){ //加上true 就可以保留之前的資料(累加) 反之就會刪除掉
            fw.write("新年快樂"+new Date()+"\n");
            System.out.println("寫檔成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
