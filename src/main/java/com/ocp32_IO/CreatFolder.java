package com.ocp32_IO;

import java.io.File;

//建立資料夾 ... /ocp32_IO/file 資料夾
public class CreatFolder {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\ocp32_IO";
        File folder = new File(path);
        //確認 folder 是否是資料夾
        if(folder.isDirectory()){ //確認isDirectory(是不是資料夾)
            //建立Files 資料夾
            //File.separator -> "\\" or "/"
            //folder.getPath() -> "src\\main\\java\\com\\ocp32_IO"
            File files = new File(folder.getPath()+ File.separator + "files");
            //File files = new File("src\\main\\java\\com\\ocp32_IO\\files");
            //確認 files 是否已經被建立
            if(files.exists()){
                System.out.printf("%s 已經被建立\n",files);
            }else {
                System.out.printf("建立 %s 目錄: ",files);
                    //建立目錄不用try.catch 建立檔案才需要
                    //check 會得到是否建立成功的boolean 值
                    boolean check = files.mkdir();
                    if(check){
                        System.out.print("成功");
                    }else {
                        System.out.print("失敗");
                    }                                   
            }
        }else{
            System.out.printf("%s 不是資料夾\n",folder);
        }
    }    
}
