package com.Homepractice.day1213;

public class Store {
   public Animal [] animals(){
       Animal [] animals={
           new Dog("貴賓",100),
           new Dog("吉娃娃",500)               
       };
       return animals;
   }
   public int allPrice(Animal[] animals){
       int sum = 0;
       for(Animal am : animals){
           sum+=am.getprice();
       }
       return sum;
   }
   public void print(Animal[] animals){
       for(Animal am: animals){
           System.out.println(am.name());
       }
   }
}
