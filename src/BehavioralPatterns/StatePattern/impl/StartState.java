package BehavioralPatterns.StatePattern.impl;

import BehavioralPatterns.StatePattern.State;

public class StartState implements State {
    @Override
    public void doActoin() {
        System.out.println("Start the game!");
    }
}
