package BehavioralPatterns.StatePattern.impl;

import BehavioralPatterns.StatePattern.State;

public class StopState implements State {

    @Override
    public void doActoin() {
        System.out.println("Stop the game!");
    }
}
