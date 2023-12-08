package ma.enset.adapters;

import ma.enset.entities.*;

public class OldCodeGerneration {

    public void generate(Diagram diagram) {
        for (UMLEntity entity : diagram.getEntities()) {
            if (entity instanceof UMLClass) {
                UMLClass umlClass = (UMLClass) entity;
                System.out.println("public class " + umlClass.getName() + " {");
                for (Attribute attribute : umlClass.getAttributes()) {
                    System.out.println("  " + attribute.getVisibility() + " " + attribute.getType() + " " + attribute.getName() + ";");
                }
                for (Method method : umlClass.getMethods()) {
                    System.out.println("  " + method.getVisibility() + " " + method.getReturnType() + " " + method.getName() + "();");
                }
                System.out.println("}");
            } else if (entity instanceof UMLInterface) {
                UMLInterface umlInterface = (UMLInterface) entity;
                System.out.println("public interface " + umlInterface.getName() + " {");
                for (Method method : umlInterface.getAbstractMethods()) {
                    System.out.println("  " + method.getReturnType() + " " + method.getName() + "();");
                }
                System.out.println("}");
            }
        }
    }
}
