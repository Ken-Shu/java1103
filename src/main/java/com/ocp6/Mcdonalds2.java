package com.ocp6;

public class Mcdonalds2 {

    public static void main(String[] args) {

        Hambuger h1 = new Hambuger("大麥克", 70);
        Hambuger h2 = new Hambuger("麥香魚", 50);
        SideMeal s1 = new SideMeal("薯條", "大", 55);
        SideMeal s2 = new SideMeal("沙拉", 40);
        Drink d1 = new Drink("可樂","大",50);
        Drink d2 = new Drink("綠茶","大",40);
        //我買了
        Hambuger[] hambugers = {h1, h2};
        SideMeal[] sideMeals = {s1, s2};
        Drink[] drink = {d1,d2};
        //總金額
        int sum = 0;
        for (Hambuger hambuger : hambugers) {
            sum += hambuger.getPrice();
        }
        for (SideMeal sideMeal : sideMeals) {
            sum += sideMeal.getPrice();
        }
        for (Drink dddd : drink) {
            sum += dddd.getPrice();
        }
        System.out.printf("價錢:%d\n", sum);
    }
}
