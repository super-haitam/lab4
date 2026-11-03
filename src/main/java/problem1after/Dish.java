package problem1after;

public class Dish implements MenuItem {
    private final String name;
    private final double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
