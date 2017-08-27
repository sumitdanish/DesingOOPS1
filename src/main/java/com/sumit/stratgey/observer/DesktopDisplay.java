package com.sumit.stratgey.observer;

public class DesktopDisplay implements Observer {


    private Subject wheatherData;

    public DesktopDisplay(Subject wheatherData){
        this.wheatherData = wheatherData;
        this.wheatherData.addObserOrDevice(this);
    }

    public void update(String data) {
        System.out.println("Display in desktop, "+data);
    }
}