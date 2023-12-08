package ma.enset;

import ma.enset.adapters.OldCodeGenerationAdapter;
import ma.enset.adapters.OldCodeGerneration;
import ma.enset.composites.Group;
import ma.enset.entities.Diagram;
import ma.enset.entities.UMLClass;
import ma.enset.entities.UMLEntity;
import ma.enset.enums.Visibility;
import ma.enset.strategies.codegeneratorstrategy.CodeGenerationContext;
import ma.enset.strategies.codegeneratorstrategy.CodeGenerationStrategy;
import ma.enset.strategies.codegeneratorstrategy.JavaCodeGenerationStrategy;
import ma.enset.strategies.exportstrategy.ExportContext;
import ma.enset.strategies.exportstrategy.JsonExportStrategy;
import ma.enset.strategies.exportstrategy.XMLExportStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern");

        Diagram diagram = new Diagram();

        UMLClass umlClass = new UMLClass();
        umlClass.setName("UMLClass");
        umlClass.setFinal(true);
        umlClass.setStatic(true);
        umlClass.setVisibility(Visibility.PUBLIC);

        CodeGenerationStrategy codeGenerationStrategy = new JavaCodeGenerationStrategy();
        codeGenerationStrategy.generateCode(diagram);


        System.out.println("Exporting startegy pattern");
        Diagram myDiagram = new Diagram();

        ExportContext exportContext = new ExportContext(new XMLExportStrategy());
        exportContext.exportDiagram(myDiagram);

        exportContext.setExportStrategy(new JsonExportStrategy());
        exportContext.exportDiagram(myDiagram);


        System.out.println("Composite Design Pättern");
        CodeGenerationContext context = getCodeGenerationContext(codeGenerationStrategy);
        Diagram newDiagram = new Diagram();
        List<UMLEntity> entities =new ArrayList<>();
        entities.add(umlClass);
        newDiagram.setEntities(entities);
        context.generateCode(newDiagram);

    }

    private static CodeGenerationContext getCodeGenerationContext(CodeGenerationStrategy codeGenerationStrategy) {
        Group myGroup = new Group();
        myGroup.setName("MyGroup");

        UMLEntity class1 = new UMLClass();
        myGroup.addEntity(class1);

        UMLEntity class2 = new UMLClass();
        myGroup.addEntity(class2);

        myGroup.displayGroup();


        OldCodeGerneration oldCodeGenerator = new OldCodeGerneration();

        CodeGenerationStrategy adapter = new OldCodeGenerationAdapter(oldCodeGenerator);
        CodeGenerationContext context = new CodeGenerationContext(codeGenerationStrategy);
        context.setCodeGenerationStrategy(adapter);
        return context;
    }
}