package DecoratorPattern.impl;

import DecoratorPattern.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.print("Draw rectangle");
    }
}
