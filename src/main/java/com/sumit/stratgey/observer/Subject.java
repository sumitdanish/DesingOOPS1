package com.sumit.stratgey.observer;

public interface Subject {

    public void addObserOrDevice(Observer o);
    public void removeObserverOrDevice(Observer o);

    public void notifyToObserver();
}
