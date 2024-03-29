package BehavioralPatterns.CommandPattern;

public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Buy " + quantity + " " + name + "!");
    }

    public void sell() {
        System.out.println("Sell " + quantity + " " + name + "!");
    }
}
