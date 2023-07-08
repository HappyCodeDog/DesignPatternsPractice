package ProxyPattern.impl;

import ProxyPattern.Image;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Playing real image: " + fileName);
    }

    private void loadFromDisk() {
        System.out.println("Loading from disk: " + fileName);
    }
}
