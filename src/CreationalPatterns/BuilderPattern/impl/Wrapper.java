package CreationalPatterns.BuilderPattern.impl;

import CreationalPatterns.BuilderPattern.Packing;

public class Wrapper implements Packing {
    public String pack() {
        return "Wrapper";
    }
}
