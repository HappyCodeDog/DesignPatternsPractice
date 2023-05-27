package DecoratorPattern.impl;

import DecoratorPattern.Shape;
import DecoratorPattern.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

    private String borderWidth;

    public RedShapeDecorator(Shape shape) {
        super(shape);
        setRedBorder("1");
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" with " + borderWidth +
                "-width red border!");
    }

    private void setRedBorder(String borderWidth) {
       this.borderWidth = borderWidth;
    }

}
