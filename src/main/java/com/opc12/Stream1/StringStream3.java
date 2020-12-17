package com.opc12.Stream1;

import java.util.stream.Stream;

public class StringStream3 {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "C", "Visual Basic"};
        //印出每個字串長度的總和
        //{4,6,1,12} = 23
        int sum = Stream.of(names).mapToInt(x -> x.length()).sum();
        System.out.println(sum);
        //印出長度<=4的長度各是多少
        Stream.of(names)//{"Java", "Python", "C", "Visual Basic"};
                .mapToInt(x -> x.length())//{4,6,1,12}
        .filter(x -> x <=4) //過濾 結果 4 1
                .forEach(x -> System.out.println(x)); //foreach 印出全部 4 1
    
   Stream.of(names)//{"Java", "Python", "C", "Visual Basic"};
        .mapToInt(String::length)//{4,6,1,12}
        .filter(Util::isLessThan4) //過濾 結果 4 1
        .forEach(System.out::println); //foreach 印出全部 4 1
    }
}
