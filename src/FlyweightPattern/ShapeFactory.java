package FlyweightPattern;

import FlyweightPattern.impl.Circle;

import java.util.HashMap;

public class ShapeFactory {
    public HashMap<String, Circle> circleMap = new HashMap();

    public Shape getCircle(String color) {
        Circle circle;
        if (circleMap.containsKey(color)) {
            circle = circleMap.get(color);
        } else {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }
        return circle;
    }
}
