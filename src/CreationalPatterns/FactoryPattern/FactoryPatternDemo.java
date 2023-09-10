package CreationalPatterns.FactoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        String shapeType = "Circle";
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(shapeType);
        shape.draw();

        shapeType = "Square";
        shape = shapeFactory.getShape(shapeType);
        shape.draw();
    }
}
