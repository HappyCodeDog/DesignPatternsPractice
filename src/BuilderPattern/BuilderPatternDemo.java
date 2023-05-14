package BuilderPattern;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("Total cost: " + vegMeal.getCost());
        vegMeal.showItems();

        Meal nonVegMeal = builder.prepareNonVegMeal();
        System.out.println("Total cost: " + nonVegMeal.getCost());
        nonVegMeal.showItems();
    }
}
