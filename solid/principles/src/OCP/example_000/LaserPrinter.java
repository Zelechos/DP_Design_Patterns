package OCP.example_000;

public class LaserPrinter extends RealPrinter{
    @Override
    public void printDocument(DocumentToPrint document) {
        System.out.println("print" + document + "with lase printer");
    }
}
