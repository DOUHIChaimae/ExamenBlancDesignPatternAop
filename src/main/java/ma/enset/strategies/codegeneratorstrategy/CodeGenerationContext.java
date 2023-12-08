package ma.enset.strategies.codegeneratorstrategy;

import ma.enset.entities.Diagram;

public class CodeGenerationContext {
    private CodeGenerationStrategy codeGenerationStrategy;

    public CodeGenerationContext(CodeGenerationStrategy codeGenerationStrategy) {
        this.codeGenerationStrategy = codeGenerationStrategy;
    }

    public void generateCode(Diagram diagram) {
        codeGenerationStrategy.generateCode(diagram);
    }

    public void setCodeGenerationStrategy(CodeGenerationStrategy codeGenerationStrategy) {
        this.codeGenerationStrategy = codeGenerationStrategy;
    }
}
