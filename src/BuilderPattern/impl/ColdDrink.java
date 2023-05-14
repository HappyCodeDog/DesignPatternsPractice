package BuilderPattern.impl;

import BuilderPattern.Item;
import BuilderPattern.Packing;

public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }
}
