package com.sumit.stratgey.observer;

public class Main {

    public static void main(String[] args) {
        WheatherData wheatherData = new WheatherData();
        wheatherData.setData("Hello Observer !!!");
        DesktopDisplay desktopDisplay = new DesktopDisplay(wheatherData);
        DeviceDisplay deviceDisplay = new DeviceDisplay(wheatherData);
        MobileDIsplay mobileDIsplay = new MobileDIsplay(wheatherData);
        wheatherData.notifyToObserver();
        wheatherData.setData("Hello Observer I am updating you , please notify to all belonging ");
        wheatherData.updateData("Got updated value !!!");
    }
}
