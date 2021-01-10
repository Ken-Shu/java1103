package com.Homepractice.OneToTry.多型;


public class AnimalMain {
    public static void main(String[] args) {
        Animal [] animals = new Animal[]{
        new Animal("狗", Animal.Dog),
        new Animal("貓", Animal.Cat),
        new Animal("鳥", Animal.Bird)
        };
        for(Animal animal :animals){
            String name = animal.getName();
            int type = animal.getType();
            System.out.println("名稱: "+name+" type "+type);
        }
    }
                
    }
    

