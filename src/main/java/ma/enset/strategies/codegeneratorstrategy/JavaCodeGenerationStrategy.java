package ma.enset.strategies.codegeneratorstrategy;

import ma.enset.entities.*;

public class JavaCodeGenerationStrategy implements CodeGenerationStrategy {

    public void generateCode(Diagram diagram) {
        for (UMLEntity entity : diagram.getEntities()) {
            UMLClass umlClass = (UMLClass) entity;
            System.out.println("package ma.enset.entities;");
            System.out.println();
            System.out.println("public class " + umlClass.getName() + " extends UMLClass{");
            System.out.println();
            System.out.println("}");
            System.out.println();
        }
        for (UMLRelation umlRelation : diagram.getRelations()) {
            if (umlRelation instanceof UMLInheritance) {
                System.out.println("package ma.enset.entities;");
                System.out.println();
                System.out.println("public class " + umlRelation.getSourceEntity() + " extends UMLRelation{");
                System.out.println();
                System.out.println("}");
                System.out.println();
            }
            if (umlRelation instanceof UMLImplementation) {
                System.out.println("package ma.enset.entities;");
                System.out.println();
                System.out.println("public class " + umlRelation.getSourceEntity() + " extends UMLRelation{");
                System.out.println();
                System.out.println("}");
                System.out.println();
            }
        }
    }
}
