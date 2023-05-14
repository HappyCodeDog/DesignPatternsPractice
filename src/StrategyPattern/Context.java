package StrategyPattern;

public class Context {

    private Strategy strategy;

    public int executeStrategy(int num1, int num2) {
        if (strategy == null) {
            throw new RuntimeException("Please set strategy first!");
        }

        return strategy.doOperation(num1, num2);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
