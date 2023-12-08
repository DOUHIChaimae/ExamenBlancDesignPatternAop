package ma.enset.entities;


import java.util.ArrayList;
import java.util.List;

public class Diagram {

    private List<UMLEntity> entities = new ArrayList<>();
    private List<UMLRelation> relations = new ArrayList<>();

    public List<UMLEntity> getEntities() {
        return entities;
    }

    public List<UMLRelation> getRelations() {
        return relations;
    }

    public void setEntities(List<UMLEntity> entities) {
        this.entities = entities;
    }

    public void setRelations(List<UMLRelation> relations) {
        this.relations = relations;
    }
}
