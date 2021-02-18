
package com.ocp33_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FullTextSearch {
    static int count = 0;
    public static void main(String[] args) throws Exception {
        //總共寫了幾隻java 程式
        //尋訪家目錄下面的所有路徑與檔案(包含子目錄)
        //並列出路徑/檔案名稱與建立時間
        //Files.walk 遞回
        String path ="C:\\Users\\MB-207\\Documents\\NetBeansProjects\\java1103\\src\\main\\java";
        Stream<Path> paths = Files.walk(Paths.get(path));
        
        paths.parallel()//平行運算(多執行緒)
             .filter(p -> p.toString().contains(".java"))
             .filter(p -> {
                 try {
                     //針對 money 找到字串 找到為 true 反之為 false
                return Files.lines(p).filter( s -> s.contains("money")).findFirst().isPresent();
            } catch (Exception e) {
            }                 
                 return false;
             })
            .forEach(p -> {             
            try {
                Path p2 = p.toAbsolutePath();
                System.out.print(++count+" . ");
                System.out.print(p2 + " : ");
                System.out.println(Files.readAttributes(p2, BasicFileAttributes.class).creationTime());
            } catch (Exception e) {
                }
            });
    }    
}

