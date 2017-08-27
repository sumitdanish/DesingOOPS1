package com.sumit.stratgey.observer;

public class MobileDIsplay implements Observer {


    private Subject wheatherData;

    public MobileDIsplay(Subject wheatherData){
        this.wheatherData = wheatherData;
        this.wheatherData.addObserOrDevice(this);
    }

    public void update(String data) {
        System.out.println("Displaying din mobile desktop ,"+data);
    }
}
