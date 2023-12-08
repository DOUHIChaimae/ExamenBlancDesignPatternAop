package ma.enset.strategies.exportstrategy;

import ma.enset.entities.Diagram;

public class ExportContext {
    private ExportStrategy exportStrategy;

    public ExportContext(ExportStrategy exportStrategy) {
        this.exportStrategy = exportStrategy;
    }

    public void setExportStrategy(ExportStrategy exportStrategy) {
        this.exportStrategy = exportStrategy;
    }

    public void exportDiagram(Diagram diagram) {
        exportStrategy.export(diagram);
    }
}

