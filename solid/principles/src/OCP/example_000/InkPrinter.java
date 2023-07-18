package OCP.example_000;

public class InkPrinter extends RealPrinter{
    @Override
    public void printDocument(DocumentToPrint document) {
        System.out.println("print" + document + "with ink printer");
    }
}
