package com.ocp32_IO;

import java.io.File;
import java.io.IOException;

public class CreateTempFiles {

    public static void main(String[] args) {
        File files = new File("src\\main\\java\\com\\ocp32_IO\\files");
        if (files.exists()) {
            try {
                for (int i = 0; i < 10; i++) {
                    File tmpFile = File.createTempFile("temp", ".txt", files);
                    System.out.printf("建立 %s 成功\n", tmpFile);
                }
            } catch (IOException e) {
                //印出簡要錯誤
                System.out.println(e);
                //印出詳細錯誤
                //就數告訴你第幾行錯誤                
                e.printStackTrace();
            }

        } else {
            System.out.printf("%s 不存在\n", files);
        }
    }
}
