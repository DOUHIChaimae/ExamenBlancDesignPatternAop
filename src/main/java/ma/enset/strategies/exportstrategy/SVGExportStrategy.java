package ma.enset.strategies.exportstrategy;

import ma.enset.entities.Diagram;

public class SVGExportStrategy implements ExportStrategy {

    public void export(Diagram diagram) {
        System.out.println("Exporting SVG");
    }

}
