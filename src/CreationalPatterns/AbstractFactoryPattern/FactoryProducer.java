package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.FactoryPattern.ShapeFactory;

public class FactoryProducer {
    public AbstractFactory getFactory(String factoryType) {
        switch (factoryType) {
            case "Shape":
                return new ShapeFactory();
            case "Color":
                return new ColorFactory();
        }
        throw new RuntimeException("No such a Factory!");
    }
}
