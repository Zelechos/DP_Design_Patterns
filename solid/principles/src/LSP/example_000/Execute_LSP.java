package LSP.example_000;

public class Execute_LSP {
    public static void main(String[] args) {
        Adult adult = new Adult("pedro","perez","12345678A","4050-5090...");
        Child child = new Child("miguel", "vanbutten", adult);
        child.getTutor().pay();
    }
}
