package AbstractFactoryPattern;

import FactoryPattern.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
    public abstract Color getColor(String shapeType);


}
