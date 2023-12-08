package ma.enset;

import ma.enset.observers.Observer;

public class AttributeObserver implements Observer {


    @Override
    public void update(String attributeName, Object newValue) {
        System.out.println("Attribute " + attributeName + " has been updated with value " + newValue);
    }
}
