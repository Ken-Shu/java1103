package com.Homepractice.OCA陣列;



class Star {

    String name;
    int neighbor;

    public Star(String name, int n) {
        this.name = name;
        this.neighbor = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(int neighbor) {
        this.neighbor = neighbor;
    }
    
}


public class Test4 {

    
    public static void main(String[] args) {
        Star[] stars = {
            new Star("Mercury", 0),
            new Star("Venus", 0),
            new Star("Earth", 1),
            new Star("Mars", 2)
        };
        System.out.println(stars[0].name);
        System.out.println(stars[2].name);
        System.out.println(stars[2].getNeighbor());
    }

}

