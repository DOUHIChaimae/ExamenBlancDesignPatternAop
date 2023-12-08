package ma.enset;

public class UMLFramework {

    private static final UMLFramework instance = new UMLFramework();

    private UMLFramework() {}

    public static UMLFramework getInstance() {
        return instance;
    }


}
