package com.ocp15;

//群組 GroupBy 數量 Count , 排序 Sort

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","apple","banana",
                                           "apple","banana","watermelo","orange");
        
        //分組
        Map<String , Long> result = fruits.stream()
                //Function.identity 每一個資料 Collectors.counting 計算分組
                //Function 計算 回傳運算子
                //counting 加總資料
                                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
        
        //排序
        result.entrySet()
                .stream()
                .sorted(Map.Entry.<String , Long>comparingByValue().reversed())
                //.sorted((a,b)-> (int)b.getValue - a.getValues);
                .forEach(e -> System.out.println(e));
        
        //排序2
        result.entrySet()
                .stream()               
                .sorted((a,b)-> (int)(b.getValue() - a.getValue()))
                .forEach(e -> System.out.println(e));
        
        //將排序結果 放入到集合中
        Map map = new LinkedHashMap();
        result.entrySet().stream()
                .sorted(Map.Entry.<String , Long>comparingByValue().reversed())
                .forEach(e -> map.put(e.getKey(), e.getValue()));
        System.out.println(map);
    }
    
}
