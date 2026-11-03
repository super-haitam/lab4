package problem1after;

public class LoyaltyService implements OrderListener {
    @Override
    public void statusChanged(Order order) {
        System.out.printf("[sms to loyalty service] %s\n", "order " + order.getStateName());
    }
}
