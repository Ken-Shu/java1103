package com.Homepractice.homeWorkToIO;

import java.io.File;

public class DeleteFolder {

    public static void main(String[] args) {
        File files = new File("src\\main\\java\\com\\Homepractice\\homeWorkToIO\\file");
        if (files.exists()) {
            if (files.delete()) {
                //刪除資料夾
                System.out.printf("%s 刪除成功\n", files);
            } else {
                System.out.printf("%s 刪除失敗\n", files);
            }
        } else {
            System.out.printf("%s 不存在\n", files);
        }
    }

}
