package problem1after;

import java.util.ArrayList;
import java.util.List;

public class Combo implements MenuItem {
    private final String name;
    private final List<MenuItem> children;

    public Combo(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    Combo add(MenuItem menuItem) {
        children.add(menuItem);
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (MenuItem menuItem : children) {
            price += menuItem.getPrice();
        }

        return price * 0.9;
    }
}
