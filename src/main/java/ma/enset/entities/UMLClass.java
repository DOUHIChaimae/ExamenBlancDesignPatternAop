package ma.enset.entities;


import ma.enset.observers.Observable;
import ma.enset.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class UMLClass extends UMLEntity implements Observer {
    private List<Attribute> attributes = new ArrayList<>();
    private List<Method> methods;
    private List<Constructor> constructors;
    private boolean isAbstract;


    public List<Attribute> getAttributes() {
        return attributes;
    }

    public List<Method> getMethods() {
        return methods;
    }

    @Override
    public void update(String attributeName, Object newValue) {
        System.out.println("Attribute " + attributeName + " has been updated to " + newValue);
    }
}
