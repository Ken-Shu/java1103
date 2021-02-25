
package com.Homepractice.HomeToPattern;

public class PlayGame extends Game{
    protected Game game;

    public PlayGame(Game game) {
        this.game = game;
    }

    
    @Override
    public String getname() {
        return game.getname() + " , " + name;
    }

    @Override
    public int getsex() {
        return game.getsex();
    }
    
}
