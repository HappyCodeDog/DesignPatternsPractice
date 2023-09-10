package CreationalPatterns.BuilderPattern.impl;

import CreationalPatterns.BuilderPattern.Item;
import CreationalPatterns.BuilderPattern.Packing;

public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }
}
