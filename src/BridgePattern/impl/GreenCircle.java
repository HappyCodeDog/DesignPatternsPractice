package BridgePattern.impl;

import BridgePattern.DrawAPI;

public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle() {
        System.out.println("Draw green circle!");
    }
}
