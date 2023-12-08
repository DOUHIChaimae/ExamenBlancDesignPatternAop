package ma.enset.entities;


import java.util.ArrayList;
import java.util.List;

public class UMLClass extends UMLEntity{
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

}
