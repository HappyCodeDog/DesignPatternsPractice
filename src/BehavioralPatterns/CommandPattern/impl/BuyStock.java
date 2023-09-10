package BehavioralPatterns.CommandPattern.impl;

import BehavioralPatterns.CommandPattern.Order;
import BehavioralPatterns.CommandPattern.Stock;

public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
