package com.ocp32_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextIntoFile {
    public static void main(String[] args) {
        //注意 因為要 開檔案 寫檔案 還要關檔案 所以最後一定要 close
        File file = new File("src\\main\\java\\com\\ocp32_IO\\files\\data.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            fw.write("Hello World");
            System.out.println("寫檔成功");
        } catch (IOException e) {
        }finally{
            try {
               fw.close();  
            } catch (IOException ex) {
            }           
        }    
    }
}
