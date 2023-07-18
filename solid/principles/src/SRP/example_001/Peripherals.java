package SRP.example_001;

public class Peripherals {

    private String name;
    private double price;
    private boolean warranty;

    public Peripherals(String name, double price, boolean warranty) {
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }

    public Peripherals() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }
}
