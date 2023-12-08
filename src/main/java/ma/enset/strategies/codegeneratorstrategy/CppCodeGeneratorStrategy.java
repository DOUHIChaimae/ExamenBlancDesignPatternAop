package ma.enset.strategies.codegeneratorstrategy;

import ma.enset.entities.Diagram;

public class CppCodeGeneratorStrategy  implements CodeGenerationStrategy {

    public void generateCode(Diagram diagram) {
        System.out.println("Generating C++ code");
    }
}
