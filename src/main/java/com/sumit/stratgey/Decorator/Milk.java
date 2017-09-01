package com.sumit.stratgey.Decorator;

public class Milk extends Condiments {

    private Bevrage bevrage;

    public Milk(Bevrage bevrage){
        this.bevrage = bevrage;
    }


    public String getDescription() {
        return this.bevrage.getDescription()+" : "+" Milkey !!!";
    }

    public double cost() {
        return this.bevrage.cost()+20.89;
    }
}
