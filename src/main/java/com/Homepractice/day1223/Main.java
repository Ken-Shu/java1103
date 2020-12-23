package com.Homepractice.day1223;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Set<Exam>exams=new LinkedHashSet<>();
        IntStream.rangeClosed(1, 10).forEach(e -> exams.add(new Exam()));
        System.out.println("全班成績:"+exams);
        
        //列出10個人的業績
        System.out.println("全部人的業績:");
        exams.stream()
                .mapToInt(e -> e.getSellmoney())                
                .forEach(money -> System.out.println(money+", "));      
        //最高業績
        System.out.println("列出最高業績");
        int max_exams =exams.stream()
                .mapToInt(e -> e.getSellmoney())
                .max()
                .getAsInt();   
                System.out.println(max_exams);
        //列出最高業績者
        System.out.println("列出最高業績的是誰");
        exams.stream()
                .filter(x -> x.getSellmoney()==max_exams)
                .forEach(x -> System.out.println(x.getName()+", "));
        //總業績為多少
        System.out.println("全部總業績是多少");
        int sum1 = exams.stream()
                .mapToInt(e -> e.getSellmoney())
                .sum();
                System.out.println("群體業績:"+sum1);
        //平均業績是多少
        System.out.println("平均業績是多少");
        double ave =exams.stream()
                .mapToDouble(e -> e.getSellmoney())
                .average()
                .getAsDouble();
        System.out.println("平均業績: "+ave);
        
    }
    
}
