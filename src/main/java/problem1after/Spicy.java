package problem1after;

public class Spicy extends ExtraDecorator {

    public Spicy(MenuItem menuItem) {
        super(menuItem);
    }

    @Override
    public String getName() {
        return decoratedMenuItem.getName() + " + spicy";
    }

    @Override
    public double getPrice() {
        return decoratedMenuItem.getPrice() + 2;
    }
}
