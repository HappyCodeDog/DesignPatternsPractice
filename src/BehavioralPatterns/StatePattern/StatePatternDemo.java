package BehavioralPatterns.StatePattern;

import BehavioralPatterns.StatePattern.impl.StartState;
import BehavioralPatterns.StatePattern.impl.StopState;

public class StatePatternDemo {
    public static void main(String[] args) {
        // setup
        State startState = new StartState();
        State stopState = new StopState();
        Context context = new Context(startState);

        context.getState().doActoin();

        // change state
        context.setState(stopState);
        context.getState().doActoin();
    }
}
