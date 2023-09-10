package CreationalPatterns.PrototypePattern;

public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache shapeCache = new ShapeCache();
        shapeCache.loadCache();

        Shape shape1 = shapeCache.getShape("1");
        Shape shape2 = shapeCache.getShape("2");
        Shape shape3 = shapeCache.getShape("3");
        System.out.println(shape1.getType());
        System.out.println(shape2.getType());
        System.out.println(shape3.getType());
    }
}
