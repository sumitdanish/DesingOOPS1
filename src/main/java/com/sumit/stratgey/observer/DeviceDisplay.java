package com.sumit.stratgey.observer;

public class DeviceDisplay implements Observer {

    private Subject wheatherData;

    public DeviceDisplay(Subject wheatherData){
        this.wheatherData = wheatherData;
        this.wheatherData.addObserOrDevice(this);
    }

    public void update(String data) {
        System.out.println("Display in device, "+data);
    }
}