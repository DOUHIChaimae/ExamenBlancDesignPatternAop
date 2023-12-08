package ma.enset.entities;

import ma.enset.enums.Cardinality;

public class UMLRelation {
    protected UMLEntity sourceEntity;
    protected UMLEntity destinationEntity;
    protected Cardinality sourceCardinality;
    protected Cardinality targetCardinality;


    public UMLEntity getSourceEntity() {
        return sourceEntity;
    }
}
