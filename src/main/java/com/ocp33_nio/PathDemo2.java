package com.ocp33_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo2 {
    public static void main(String[] args) {
        //路徑結合 resolve
        Path p1 = Paths.get("C://aaa/bbb/ccc");
        //如果欲結合路徑 前方有 / 則前方路徑會被砍掉
        //("/ddd/salary.txt");(絕對路徑)
        Path p2 = Paths.get("ddd/salary.txt");
        p1 = p1.resolve(p2);
        System.out.println(p1);
    }
}
