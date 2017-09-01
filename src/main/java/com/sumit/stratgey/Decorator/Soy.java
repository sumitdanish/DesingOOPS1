package com.sumit.stratgey.Decorator;

public class Soy extends Condiments {

    private Bevrage bevrage;
    public Soy(Bevrage bevrage){
        this.bevrage = bevrage;
    }

    public String getDescription() {
        return this.bevrage.getDescription()+" : "+"Soy !!!";
    }

    public double cost() {
        return this.bevrage.cost()+2.89;
    }
}