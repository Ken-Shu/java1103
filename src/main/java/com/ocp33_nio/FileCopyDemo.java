
package com.ocp33_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        // 複製文件
        Path source = Paths.get("src\\main\\java\\com\\ocp33_nio\\a.txt");
        Path target = Paths.get("src\\main\\java\\com\\ocp33_nio\\b.txt");
        //如果 今天沒有(目的端) b.txt 則 StandardCopyOption.REPLACE_EXISTING 可加可不加
        //如果 今天有(目的端) b.txt 則 StandardCopyOption.REPLACE_EXISTING 必須加
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);//將 source copy 到 target
        System.out.println("Copy ok");
    }
    
}
