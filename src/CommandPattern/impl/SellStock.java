package CommandPattern.impl;

import CommandPattern.Order;
import CommandPattern.Stock;

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
