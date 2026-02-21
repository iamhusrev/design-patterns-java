package com.iamhusrev._7_observer_pattern;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class DataSource implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int value;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer added");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removed");
    }

    @Override
    public void notifyObservers(int value) {
        System.out.println("Notify observers");
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }
}
