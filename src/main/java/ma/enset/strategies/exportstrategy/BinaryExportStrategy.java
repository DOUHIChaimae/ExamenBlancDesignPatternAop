package ma.enset.strategies.exportstrategy;

import ma.enset.entities.Diagram;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BinaryExportStrategy implements ExportStrategy {

    @Override
    public void export(Diagram diagram) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("diagram.bin");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(diagram);

            System.out.println("Diagram exported to binary file successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
