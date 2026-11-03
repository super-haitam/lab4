package problem1after;

public abstract class ExtraDecorator implements MenuItem {
    protected MenuItem decoratedMenuItem;

    public ExtraDecorator(MenuItem menuItem) {
        decoratedMenuItem = menuItem;
    }

    @Override
    public String getName() {
        return decoratedMenuItem.getName();
    }

    @Override
    public double getPrice() {
        return decoratedMenuItem.getPrice();
    }
}
