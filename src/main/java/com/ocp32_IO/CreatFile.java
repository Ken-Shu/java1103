package com.ocp32_IO;

import java.io.File;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\ocp32_IO\\files";
        String fname = "salary.csv"; //可以自己決定檔名
        File file = new File(path + File.separator + fname); // file.separator 等於 斜線\\
        if(file.exists()){
            System.out.printf("%s 檔案已存在\n",file);
        }else{
            System.out.printf("建立 %s 檔案",file);
            try {
                if(file.createNewFile()){
                    System.out.println("成功");
                }else{
                    System.out.println("失敗");
                }
            } catch (IOException e) {
                System.out.printf("錯誤 %s \n",e);
            }
        }
    }
    
}
