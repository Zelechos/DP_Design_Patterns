package SRP.example_001;

import java.util.List;

public class ComputerSales {

    private int value;
    private String model;
    private List<Peripherals> peripheralsList;

    public void sellComputer(){
        System.out.println("Sell the Computer $$");
    }

    public void sellUsedComputer(){
        System.out.println("Sell used the Computer $$");
    }

    public void giftPeripherals(){
        System.out.println("free peripherals with the purchase of a computer");
    }

    public void buyComputer(){
        System.out.println("Buy the Computer $$");
    }

    public void buyUsedComputer(){
        System.out.println("Buy used the Computer $$");
    }

}
