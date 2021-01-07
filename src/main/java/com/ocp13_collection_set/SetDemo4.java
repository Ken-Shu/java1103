package com.ocp13_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class SetDemo4 {
    public static void main(String[] args) {
        Set<Exam>exams = new LinkedHashSet<>();
        IntStream.rangeClosed(1, 20).forEach(i -> exams.add(new Exam()));
        System.out.println("全班成績:"+exams);
        
        //國文
        System.out.println("1.國文平均");
        exams.stream()
                .mapToInt(e -> e.getChinese())
                .forEach(score -> System.out.println(score +", "));
        //計算國文平均
        double avg_chinese = exams.stream()
                .mapToInt(e -> e.getChinese())
                .average()
                .getAsDouble();
        System.out.println("平均: "+avg_chinese);
        
        //英文
        System.out.println("2.英文平均");
        exams.stream()
                .mapToInt(e -> e.getEnglish())
                .forEach(score -> System.out.println(score+", "));
        //計算英文平均
        double avg_english =exams.stream()
                .mapToInt(e -> e.getEnglish())
                .average()
                .getAsDouble();
        System.out.println("平均: "+avg_english);
        
        //數學
        System.out.println("3.數學平均");
        exams.stream()
                .mapToInt(e -> e.getMath())
                .forEach(score ->System.out.println(score+", "));
        //計算數學平均
        double avg_math = exams.stream()
                .mapToInt(e -> e.getMath())
                .average().getAsDouble();
        System.out.println("平均: "+avg_math);
        
        System.out.println("國文最高分為何?");
        int max_chinese = exams.stream()
                .mapToInt(e -> e.getChinese())
                .max()
                .getAsInt();
        System.out.print(max_chinese);
        
        System.out.println("英文最高分為何?");
        int max_english = exams.stream()
                .mapToInt(e -> e.getEnglish())
                .max()
                .getAsInt();
        System.out.println(max_english);
        
        System.out.println("數學最高分為何?");
        int max_math =exams.stream()
                .mapToInt(e -> e.getMath())
                .max()
                .getAsInt();
        System.out.println(max_math);
        
        System.out.println("國文最高分的人名為何?");
        exams.stream()
                .filter(e -> e.getChinese() == max_chinese)
                .forEach(e -> System.out.print(e.getName()+", "));
        System.out.println();
        
        System.out.println("英文最高分的人名為何?");
        exams.stream()
                .filter(e -> e.getEnglish() == max_english)
                .forEach(e -> System.out.println(e.getName()+", "));
        System.out.println();
        
        System.out.println("數學最高分的人名為何?");
        exams.stream()
                .filter(e -> e.getMath() == max_math)
                .forEach(e -> System.out.println(e.getName()+", "));
        System.out.println();
        
        System.out.println("6.總成績最高的人名為何? 幾分?");
        int max_score = exams.stream()
                .mapToInt(e -> e.getChinese()+e.getEnglish()+e.getMath())
                .max()
                .getAsInt();
        exams.stream()
                .filter(e -> e.getChinese()+e.getEnglish()+e.getMath()==max_score)
                .forEach(e -> System.out.println(e.getName()+", "));
        System.out.println(max_score);
    }
    
}
