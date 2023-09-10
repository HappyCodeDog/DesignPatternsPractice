package StructuralPattern.FlyweightPattern;

import StructuralPattern.FlyweightPattern.impl.Circle;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FlyWeightPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        for (int i = 0; i < 10; i++) {
            Circle circle = (Circle)shapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());

            System.out.println(circle);
            circle.draw();
            System.out.println();
        }
    }

    public static String getRandomColor() {
        List<String> colors = Arrays.asList("red", "green", "blue", "black", "white");
        Random random = new Random();
        int randomNumber = random.nextInt(colors.size());
        return colors.get(randomNumber);
    }

    public static int getRandomX() {
        Random random = new Random();
        return random.nextInt(200) - 100;
    }

    public static int getRandomY() {
        Random random = new Random();
        return random.nextInt(200) - 100;
    }
}
