package com.ocp15_groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupByDemo2 {

    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("Apple"     , 10, 10),
                new Fruit("orange"    , 15, 15),
                new Fruit("Apple"     , 20, 10),
                new Fruit("banana"    , 20, 10),
                new Fruit("watermelon", 10, 20),
                new Fruit("papaya"    , 15, 15),
                new Fruit("Apple"     , 20, 15),
                new Fruit("Apple"     , 20, 10)
        );
        //每一種水果有幾組
        //e->e.getName() 可以寫成 Fruit::getName
        Map<String , Long> counting = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()));
        System.out.println(counting);
        
        //每一種水果有幾個
        //summingInt 自動對指定物件連加
        Map<String , Integer>sum = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getName,Collectors.summingInt(Fruit::getQty)));
               System.out.println(sum);
               
        //根據價格來分組
        Map<Integer,List<Fruit>> groupByPrice = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getPrice));
        System.out.println(groupByPrice);
        //根據價格來分組(水果名稱不可重複)
        Map<Integer,Set<String>>groutByPrice2=fruits.stream()//此處型別對應Integer
                .collect(Collectors.groupingBy(Fruit::getPrice , Collectors.mapping(Fruit::getName, Collectors.toSet())));//此處型別對應Set<String>
        System.out.println(groutByPrice2);
    }

}
