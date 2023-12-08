package ma.enset.adapters;

import ma.enset.entities.Diagram;
import ma.enset.strategies.codegeneratorstrategy.CodeGenerationStrategy;

public class OldCodeGenerationAdapter implements CodeGenerationStrategy {
    private OldCodeGerneration oldCodeGenerator;

    public OldCodeGenerationAdapter(OldCodeGerneration oldCodeGenerator) {
        this.oldCodeGenerator = oldCodeGenerator;
    }

    @Override
    public void generateCode(Diagram diagram) {
        oldCodeGenerator.generate(diagram);
    }


}
