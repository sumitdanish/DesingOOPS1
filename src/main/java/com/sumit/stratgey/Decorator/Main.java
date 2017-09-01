package com.sumit.stratgey.Decorator;

public class Main {
    public static void main(String[] args) {
        Bevrage bevrage = new Expresso();
        //Adding some condiments

        bevrage = new Mocha(bevrage);
        bevrage = new Mocha(bevrage);
        bevrage = new Milk(bevrage);
        bevrage = new Soy(bevrage);
        System.out.println(bevrage.getDescription());
        System.out.println(bevrage.cost());
    }
}
