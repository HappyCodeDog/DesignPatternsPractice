package StructuralPattern.DecoratorPattern.impl;

import StructuralPattern.DecoratorPattern.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.print("Draw rectangle");
    }
}
