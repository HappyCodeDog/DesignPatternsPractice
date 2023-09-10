package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.FactoryPattern.Shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory factory1 = factoryProducer.getFactory("Shape");
        Shape shape1 = factory1.getShape("Circle");
        shape1.draw();

        AbstractFactory factory2 = factoryProducer.getFactory("Color");
        Color color1 = factory2.getColor("Green");
        color1.fill();
    }
}
