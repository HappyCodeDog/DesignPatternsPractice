package StrategyPattern;

import StrategyPattern.impl.OperationAdd;
import StrategyPattern.impl.OperationMultiply;
import StrategyPattern.impl.OperationSubstract;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        Context context = new Context();

        context.setStrategy(new OperationAdd());
        System.out.println(context.executeStrategy(num1, num2));

        context.setStrategy(new OperationSubstract());
        System.out.println(context.executeStrategy(num1, num2));

        context.setStrategy(new OperationMultiply());
        System.out.println(context.executeStrategy(num1, num2));
    }
}
