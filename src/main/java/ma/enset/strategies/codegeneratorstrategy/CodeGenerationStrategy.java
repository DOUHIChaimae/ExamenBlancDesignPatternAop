package ma.enset.strategies.codegeneratorstrategy;

import ma.enset.entities.Diagram;

public interface CodeGenerationStrategy {
    public void generateCode(Diagram diagram);
}
