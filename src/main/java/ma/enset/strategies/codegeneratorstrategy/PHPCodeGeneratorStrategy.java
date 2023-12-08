package ma.enset.strategies.codegeneratorstrategy;

import ma.enset.entities.Diagram;

public class PHPCodeGeneratorStrategy implements CodeGenerationStrategy {

    public void generateCode(Diagram diagram) {
        System.out.println("Generating PHP code");
    }
}
