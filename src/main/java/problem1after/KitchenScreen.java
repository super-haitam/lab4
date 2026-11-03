package problem1after;

public class KitchenScreen implements OrderListener {
    @Override
    public void statusChanged(Order order) {
        if (order.getStateName().equals("PAID")) {
            System.out.printf("[kitchen] %s\n", "new order for " + order.getCustomer());
        }
    }
}
