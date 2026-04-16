package Learnings.Behavioural.Observer.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject superclass
 * May have zero or more observers registered at any given time
 * */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
