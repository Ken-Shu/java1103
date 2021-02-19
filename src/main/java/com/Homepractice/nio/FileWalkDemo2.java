
package com.Homepractice.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FileWalkDemo2 {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        String path ="C:\\Users\\ABC\\javacode\\java1103\\src\\main\\java";
        Stream<Path> paths = Files.walk(Paths.get(path));
        
        paths.filter(f -> f.toString().contains(".java"))
              .forEach(f ->{
                  try {
                Path p = f.toAbsolutePath();
                      System.out.print(++count+" . ");
                      System.out.print(f+ " : ");
                      System.out.println(Files.readAttributes(p, BasicFileAttributes.class).creationTime());
            } catch (Exception e) {
                e.printStackTrace();
            }
              });
    }
}
