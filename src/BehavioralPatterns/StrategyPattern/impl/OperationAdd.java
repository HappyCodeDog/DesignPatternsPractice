package BehavioralPatterns.StrategyPattern.impl;

import BehavioralPatterns.StrategyPattern.Strategy;

public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
