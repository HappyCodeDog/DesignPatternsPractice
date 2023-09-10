package StructuralPattern.FacadePattern.impl;

import StructuralPattern.FacadePattern.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw rectangle!");
    }
}
