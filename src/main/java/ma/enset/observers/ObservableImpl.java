package ma.enset.observers;

import java.util.List;

public class ObservableImpl implements Observable {
    private List<Observer> observers;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String attributeName, Object newValue) {
        for (Observer observer : observers) {
            observer.update(attributeName, newValue);
        }
    }

}
