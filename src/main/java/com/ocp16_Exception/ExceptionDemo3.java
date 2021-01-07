package com.ocp16_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo3 {

    public static void main(String[] args) throws FileNotFoundException {
        //右鍵預開啟檔案 複製位置 貼上
        File file = new File("src\\main\\java\\com\\ocp16_Exception\\number.txt");
//        try {
//            Scanner sc = new Scanner(file);
//            System.out.println("找到檔案");
//        } catch (FileNotFoundException e) {
//            System.out.println("找不到檔案");
//        }
        //throw 轉拋給java做判斷
        Scanner sc = new Scanner(file);
        System.out.println("找到檔案了");
    }
}
