package LSP.example_000;

public class Adult {

    private String name;
    private String lastName;
    private String dni;
    private String  card;

    public Adult(String name, String lastName, String dni, String card) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void pay(){
        System.out.println("mi dni es " + getDni() + "pago con la tarjeta" + getCard());
    }
}
