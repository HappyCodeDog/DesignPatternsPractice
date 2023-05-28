package FlyweightPattern.impl;

import FlyweightPattern.Shape;

public class Circle implements Shape {
    private int x = 0;
    private int y = 0;
    private int radius = 0;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("[Color]:"+color+" [X]:"+x+" [Y]:"+y+" [Radius]:"+radius);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
