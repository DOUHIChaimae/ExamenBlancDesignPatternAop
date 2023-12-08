package ma.enset.strategies.exportstrategy;

import ma.enset.entities.Diagram;

public class JsonExportStrategy implements ExportStrategy {

    public void export(Diagram diagram) {
        System.out.println("Exporting JSON");
    }

}
