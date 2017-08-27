package com.sumit.stratgey.observer;

import javafx.beans.binding.ObjectExpression;

import java.util.ArrayList;
import java.util.List;

public class WheatherData implements Subject {

    private List<Observer> observerListOrDeviceList;

    private String data;

    public WheatherData(){
        observerListOrDeviceList = new ArrayList<Observer>();
    }

    public void addObserOrDevice(Observer o) {
        this.observerListOrDeviceList.add(o);
    }

    public void removeObserverOrDevice(Observer o) {
        int i = this.observerListOrDeviceList.indexOf(o);
        if(i != -1){
            this.observerListOrDeviceList.remove(o);
        }
    }

    public void notifyToObserver() {
        for(Observer o : this.observerListOrDeviceList){
            o.update(this.getData());
        }
    }


    public void updateData(String data){
        this.setData(data);
        notifyToObserver();
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
