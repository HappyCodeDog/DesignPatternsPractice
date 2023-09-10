package CreationalPatterns.BuilderPattern.impl;

import CreationalPatterns.BuilderPattern.Packing;

public class Bottle implements Packing {
    public String pack() {
        return "Bottle";
    }
}
