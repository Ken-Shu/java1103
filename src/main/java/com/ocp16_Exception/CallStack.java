package com.ocp16_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CallStack {

    public static void main(String[] args) {
        try {
            calc();
        } catch (FileNotFoundException e) {
            System.out.println("main方法處理了此問題");
        }
    }

    public static void calc() throws FileNotFoundException {
        openFile();
    }

    public static void openFile() throws FileNotFoundException {
        File file = new File("src\\main\\java\\com\\ocp16_Exception\\number.txt");
        Scanner sc = new Scanner(file);
    }

}
