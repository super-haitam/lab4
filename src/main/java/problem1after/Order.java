package problem1after;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String customer;

    private final List<MenuItem> menu = new ArrayList<>();

    // NEW, PAID, PREPARING, DELIVERED or CANCELLED
    private OrderState status;

    private final List<OrderListener> observers = new ArrayList<>();

    /*
    private final SmsSender sms = new SmsSender();
    private final KitchenScreen kitchen = new KitchenScreen();
     */

    public Order(String customer) {
        this.customer = customer;
        status = new NewState();

        subscribe(new CustomerSms());
        subscribe(new KitchenScreen());
    }

    public void addDish(MenuItem dish) {
        menu.add(dish);
    }

    // a combo: several dishes sold together with 10% off
    public void addCombo(String name, MenuItem[] menuItems) {
        StringBuilder sb = new StringBuilder(name).append(" [");
        if (menuItems.length > 0) sb.append(menuItems[0].getName());
        for (int i = 1; i < menuItems.length; ++i) sb.append(", ").append(menuItems[i].getName());
        sb.append("]");

        Combo combo = new Combo(sb.toString());
        for (MenuItem menuItem : menuItems) combo.add(menuItem);
        menu.add(combo);
    }

    public double total() {
        double t = 0;
        for (MenuItem menuItem : menu) t += menuItem.getPrice();
        return t;
    }

    public void print() {
        for (MenuItem menuItem : menu) {
            System.out.printf(
                    "%s: %.2f MAD\n",
                    menuItem.getName(),
                    menuItem.getPrice()
            );
        }
        System.out.printf("Total: %.2f MAD\n", total());
    }

    public String getCustomer() { return customer; }
    public String getStateName() { return status.name(); }

    void setState(OrderState status) {
        this.status = status;

        notifyObservers();
    }

    public void pay() {
        status.pay(this);
    }

    public void startPreparing() {
        status.startPreparing(this);
    }

    public void deliver() {
        status.deliver(this);
    }

    public void cancel() {
        status.cancel(this);
    }

    public void subscribe(OrderListener observer) {
        observers.add(observer);
    }

    public void unsubscribe(OrderListener observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (OrderListener observer : observers) observer.statusChanged(this);
    }
}