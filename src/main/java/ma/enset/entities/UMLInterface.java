package ma.enset.entities;

import java.util.List;

public class UMLInterface extends UMLEntity {
    private List<Method> abstractMethods;

    public List<Method> getAbstractMethods() {
        return abstractMethods;
    }
}
