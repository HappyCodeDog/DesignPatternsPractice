package FacadePattern.impl;

import FacadePattern.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw square!");
    }
}
