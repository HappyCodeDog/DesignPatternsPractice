package CreationalPatterns.PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private Map<String, Shape> shapeMap = new HashMap<>();
    
    public void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        Square square = new Square();
        square.setId("3");

        shapeMap.put(circle.getId(), circle);
        shapeMap.put(rectangle.getId(), rectangle);
        shapeMap.put(square.getId(), square);
    }
    public Shape getShape(String id) {
        if (!shapeMap.containsKey(id)) {
            throw new RuntimeException("Such id doesn't exist!");
        }
        
        return (Shape)shapeMap.get(id).clone();
    }
}
