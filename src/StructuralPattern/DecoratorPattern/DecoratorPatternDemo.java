package StructuralPattern.DecoratorPattern;

import StructuralPattern.DecoratorPattern.impl.Circle;
import StructuralPattern.DecoratorPattern.impl.Rectangle;
import StructuralPattern.DecoratorPattern.impl.RedShapeDecorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        ShapeDecorator circleDecorator = new RedShapeDecorator(new Circle());
        circleDecorator.draw();

        ShapeDecorator rectangleDecorator = new RedShapeDecorator(new Rectangle());
        rectangleDecorator.draw();
    }
}
