package BuilderPattern;

import BuilderPattern.impl.ChickenBurger;
import BuilderPattern.impl.Coke;
import BuilderPattern.impl.Pepsi;
import BuilderPattern.impl.VegBurger;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
