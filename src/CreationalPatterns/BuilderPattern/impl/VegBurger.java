package CreationalPatterns.BuilderPattern.impl;

public class VegBurger extends Burger {
    public String name() {
        return "VegBurger";
    }

    public float price() {
        return 18;
    }
}
