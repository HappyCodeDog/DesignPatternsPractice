package FacadePattern.impl;

import FacadePattern.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw rectangle!");
    }
}
