package com.sumit.stratgey;

public abstract class Dock {

    protected Quack quack;
    protected Flyable flyable;

    abstract void display();

    public void flyMe(){
        flyable.flyMe();
    }

    public void quackMe(){
        quack.quack();
    }
    public void helloWorld(){

    }

}
