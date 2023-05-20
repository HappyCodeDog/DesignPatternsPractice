package BridgePattern;

import BridgePattern.impl.GreenCircle;
import BridgePattern.impl.RedCircle;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle(new RedCircle());
        circle.draw();

        circle = new Circle(new GreenCircle());
        circle.draw();
    }
}
