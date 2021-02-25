
package com.Homepractice.HomeToPattern;

public class Main {
    public static void main(String[] args) {
        
        Game game = new Gost();
        game = new Susan(game);
        
        System.out.println("姓名:"+game.getname());
        System.out.println("性別:"+game.getsex());
    }
    
}
