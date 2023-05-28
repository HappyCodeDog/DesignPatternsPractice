package FacadePattern.impl;

import FacadePattern.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw circle!");
    }
}
