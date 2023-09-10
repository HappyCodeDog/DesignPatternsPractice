package StructuralPattern.DecoratorPattern.impl;

import StructuralPattern.DecoratorPattern.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.print("Draw circle");
    }
}
