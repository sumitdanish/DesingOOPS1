package com.sumit.stratgey.Decorator;

public class Mocha extends Condiments {

    private Bevrage bevrage;
    public Mocha(Bevrage bevrage){
        this.bevrage = bevrage;
    }




    public String getDescription() {
        return this.bevrage.getDescription()+" : "+"Mocha !!!";
    }

    public double cost() {
        return this.bevrage.cost()+3.89;
    }
}
