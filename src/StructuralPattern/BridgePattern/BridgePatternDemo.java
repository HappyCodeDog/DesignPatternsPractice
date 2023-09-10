package StructuralPattern.BridgePattern;

import StructuralPattern.BridgePattern.impl.GreenCircle;
import StructuralPattern.BridgePattern.impl.RedCircle;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle(new RedCircle());
        circle.draw();

        circle = new Circle(new GreenCircle());
        circle.draw();
    }
}
