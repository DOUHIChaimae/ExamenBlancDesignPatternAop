package ma.enset.observers;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(String attributeName, Object newValue) {
        for (Observer observer : observers) {
            observer.update(attributeName, newValue);
        }
    }
}
