package com.sumit.stratgey.Decorator;

public abstract class Bevrage {

    protected String description;
    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
