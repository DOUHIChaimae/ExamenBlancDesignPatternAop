package ma.enset.composites;

import ma.enset.entities.UMLEntity;

import java.util.ArrayList;
import java.util.List;

public class Group extends UMLEntity {
    private List<UMLEntity> entities = new ArrayList<>();

    public void addEntity(UMLEntity entity) {
        entities.add(entity);
    }

    public void displayGroup() {
        System.out.println("Group: " + getName());
        for (UMLEntity entity : entities) {
            System.out.println("  - " + entity.getName());
        }
    }

}
