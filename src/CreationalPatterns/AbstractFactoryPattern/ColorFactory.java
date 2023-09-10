package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.FactoryPattern.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {
       switch (colorType) {
           case "Red":
               return new Red();
           case "Green":
               return new Green();
       }
       throw new RuntimeException("No such a color!");
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
