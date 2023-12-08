package ma.enset.observers;


public interface Observable {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(String attributeName, Object newValue);

}
