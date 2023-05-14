package BuilderPattern;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        System.out.println("####START####");
        System.out.println("This meal consists of " +
                "the following items:");
        for (Item item : items) {
            String itemInfo = String.format("[%s] packed by [%s];",
                    item.name(), item.packing().pack());
            System.out.println(itemInfo);
        }
        System.out.println("#####END#####");
        System.out.println();
    }
}
