
package com.ocp33_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("src\\main\\java\\com\\ocp33_nio\\PathDemo.java");
        System.out.printf("filename: %s\n",path.getFileName()); //取得檔案名稱
        System.out.printf("parent: %s\n",path.getParent()); //取得檔案位置
        System.out.printf("root: %s\n",path.getRoot()); //根目錄
        System.out.printf("namecont: %s\n",path.getNameCount()); //src\\main\\java\\com\\ocp33_nio\\PathDemo.java 顯示有幾層上方路徑為6層
        System.out.printf("subpath(0, 2): %s\n",path.subpath(0, 2)); // 路徑 2 就是顯示2層 3就是3層
        System.out.printf("isAbsolute: %s\n",path.isAbsolute());
        System.out.printf("toisAbsolute: %s\n",path.toAbsolutePath()); // 絕對路徑
        System.out.printf("toUri: %s\n",path.toUri()); //相對路徑
    }
}
