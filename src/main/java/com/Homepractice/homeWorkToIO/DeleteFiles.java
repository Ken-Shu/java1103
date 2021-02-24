
package com.Homepractice.homeWorkToIO;

import java.io.File;
import java.util.Arrays;

public class DeleteFiles {
    public static void main(String[] args) {
        File files = new File("src\\main\\java\\com\\Homepractice\\homeWorkToIO\\file");
        if(files.exists()){
            System.out.println(Arrays.toString(files.list()));
            for(String fname : files.list()){
                if(fname.contains("temp")){
                    File deFile = new File(files.getPath()+File.separator+fname);
                    deFile.delete();
                }
            }
            System.out.println(Arrays.toString(files.list()));
        }else{
            System.out.printf("%s 不存在\n",files);
        }
    }
}
