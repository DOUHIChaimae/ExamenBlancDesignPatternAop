package ma.enset.observers;

import ma.enset.entities.Attribute;

public interface Observer {
    void update(String attributeName, Object newValue);
}
