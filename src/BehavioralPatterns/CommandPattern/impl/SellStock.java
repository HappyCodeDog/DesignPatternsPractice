package BehavioralPatterns.CommandPattern.impl;

import BehavioralPatterns.CommandPattern.Order;
import BehavioralPatterns.CommandPattern.Stock;

public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }
    @Override
    public void execute() {
        stock.sell();
    }
}
