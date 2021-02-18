
package com.ocp33_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class FindBug {
    public static void main(String[] args) throws IOException{            
    Path path = Paths.get("src\\main\\java\\com\\ocp33_nio\\score.csv");
    //parallel 使用多執行緒尋找時使用
   Optional<String> opt = Files.readAllLines(path) //執行緒
           .stream()                      
           .peek(s -> System.out.println(s)) // 印出(Sout) 顯示每條執行緒找的順序
           .filter(s -> s.contains("bug"))
           //.sequential()//序列 (預設) 堆疊
           .parallel()  //平行尋找 (資料量多時) 使用多執行緒去尋找所要的資料
           .findFirst();
        System.out.println(opt.isPresent());
}
}