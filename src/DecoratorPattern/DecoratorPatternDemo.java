package DecoratorPattern;

import DecoratorPattern.impl.Circle;
import DecoratorPattern.impl.Rectangle;
import DecoratorPattern.impl.RedShapeDecorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        ShapeDecorator circleDecorator = new RedShapeDecorator(new Circle());
        circleDecorator.draw();

        ShapeDecorator rectangleDecorator = new RedShapeDecorator(new Rectangle());
        rectangleDecorator.draw();
    }
}
