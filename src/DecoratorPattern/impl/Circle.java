package DecoratorPattern.impl;

import DecoratorPattern.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.print("Draw circle");
    }
}
