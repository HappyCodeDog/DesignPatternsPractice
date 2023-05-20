package BridgePattern.impl;

import BridgePattern.DrawAPI;

public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle() {
        System.out.println("Draw red circle!");
    }
}
