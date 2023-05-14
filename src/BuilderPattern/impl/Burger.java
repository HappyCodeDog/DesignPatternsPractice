package BuilderPattern.impl;

import BuilderPattern.Item;
import BuilderPattern.Packing;

public abstract class Burger implements Item {
    public abstract String name();

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
