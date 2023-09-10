package CreationalPatterns.FactoryPattern;

import CreationalPatterns.AbstractFactoryPattern.AbstractFactory;
import CreationalPatterns.AbstractFactoryPattern.Color;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            default:
                throw new RuntimeException("No such a shape!");
        }
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
