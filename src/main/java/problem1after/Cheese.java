package problem1after;

public class Cheese extends ExtraDecorator {

    public Cheese(MenuItem decoratedMenuItem) {
        super(decoratedMenuItem);
    }

    @Override
    public String getName() {
        return decoratedMenuItem.getName() + " + cheese";
    }

    @Override
    public double getPrice() {
        return decoratedMenuItem.getPrice() + 5;
    }
}
