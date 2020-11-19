package com.ocp6;

public class SetMeal {

    private Hambuger hambuger;
    private SideMeal sideMeal;
    private Drink drink;
    
    //總金額
    private int sum;
    

    public SetMeal(Hambuger hambuger, SideMeal sideMeal, Drink drink) {
        this.hambuger = hambuger;
        this.sideMeal = sideMeal;
        this.drink = drink;
        this.sum = hambuger.getPrice()+sideMeal.getPrice()+drink.getPrice();
    }

    public int getSum() {  //Insert code 僅 Get 不提供外人更改
        return sum;
    }

    public Hambuger getHambuger() {
        return hambuger;
    }

    public void setHambuger(Hambuger hambuger) {
        this.hambuger = hambuger;
    }

    public SideMeal getSideMeal() {
        return sideMeal;
    }

    public void setSideMeal(SideMeal sideMeal) {
        this.sideMeal = sideMeal;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "SetMeal{" + "hambuger=" + hambuger + ", sideMeal=" + sideMeal + ", drink=" + drink + '}';
    }

}


