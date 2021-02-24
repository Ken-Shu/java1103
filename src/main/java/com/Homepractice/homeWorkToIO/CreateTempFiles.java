
package com.Homepractice.homeWorkToIO;

import java.io.File;

public class CreateTempFiles {
    public static void main(String[] args) {
        File files = new File("src\\main\\java\\com\\Homepractice\\homeWorkToIO\\file");
        if(files.exists()){
            try {
                for(int i = 0; i<10; i++){
                    File tmpFile = File.createTempFile("temp", ".tyt", files);
                    System.out.printf("建立%s 成功\n",tmpFile);
                }
            } catch (Exception e) {
                System.out.println(e);
                
                e.printStackTrace();
            }
        }else{
            System.out.printf("%s 不存在\n",files);
        }
    }
}
