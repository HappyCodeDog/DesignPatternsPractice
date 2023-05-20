package BridgePattern;

public class Circle extends Shape {

    protected Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    public void draw() {
        drawAPI.drawCircle();
    }
}
