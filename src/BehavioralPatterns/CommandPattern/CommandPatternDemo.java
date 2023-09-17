package BehavioralPatterns.CommandPattern;

import BehavioralPatterns.CommandPattern.impl.BuyStock;
import BehavioralPatterns.CommandPattern.impl.SellStock;

public class CommandPatternDemo {

    /**
     * 命令模式：将行为请求者（Broker）和行为实现者（Order）解耦
     * @param args
     */
    public static void main(String[] args) {
        Broker broker = new Broker();

        // 买入100股腾讯
        Stock stock1 = new Stock("TencentStock", 100);
        Order buyOrder = new BuyStock(stock1);

        broker.placeOrders(buyOrder);

        // 卖出50股腾讯
        Stock stock2 = new Stock("TencentStock", 50);
        Order sellOrder = new SellStock(stock2);

        broker.placeOrders(sellOrder);

        // broker执行命令
        broker.takeOrders();
    }
}
