
package com.ocp33_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FileWalkDemo2 {
    static int count = 0;
    public static void main(String[] args) throws Exception {
        //總共寫了幾隻java 程式
        //尋訪家目錄下面的所有路徑與檔案(包含子目錄)
        //並列出路徑/檔案名稱與建立時間
        //Files.walk 遞回
        String path ="C:\\Users\\MB-207\\Documents\\NetBeansProjects\\java1103\\src\\main\\java";
        Stream<Path> paths = Files.walk(Paths.get(path));
        
        paths.filter(f -> f.toString().contains(".java"))
            .forEach(f -> {             
            try {
                Path p = f.toAbsolutePath();
                System.out.print(++count+" . ");
                System.out.print(f + " : ");
                System.out.println(Files.readAttributes(p, BasicFileAttributes.class).creationTime());
            } catch (Exception e) {
                }
            });
    }    
}

