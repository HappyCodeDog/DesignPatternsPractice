package ProxyPattern;

import ProxyPattern.impl.ProxyImage;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("Spider Man 3");
        image.display();

        image.display();
    }
}
