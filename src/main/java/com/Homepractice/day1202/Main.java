package com.Homepractice.day1202;

public class Main {

    public static void main(String[] args) {
        Zoo[] zoos
                = {new Lion("獅子", 4, "跑"),
                    new Ostrich("鴕鳥", 2, "飛")
                };
        System.out.println(zoos[1]);
        int sum = 0;
        for (Zoo zo : zoos) {
            System.out.println(zo);
            sum += zo.getFoot();
        }
        System.out.println(sum);
    }
}
