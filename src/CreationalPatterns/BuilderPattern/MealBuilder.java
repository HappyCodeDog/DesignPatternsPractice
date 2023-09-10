package CreationalPatterns.BuilderPattern;

import CreationalPatterns.BuilderPattern.impl.ChickenBurger;
import CreationalPatterns.BuilderPattern.impl.Coke;
import CreationalPatterns.BuilderPattern.impl.Pepsi;
import CreationalPatterns.BuilderPattern.impl.VegBurger;

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
