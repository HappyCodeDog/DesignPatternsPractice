package StructuralPattern.FacadePattern.impl;

import StructuralPattern.FacadePattern.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw square!");
    }
}
