package problem1after;

public class CustomerSms implements OrderListener {
    @Override
    public void statusChanged(Order order) {
        System.out.printf("[sms to %s] %s\n", order.getCustomer(), "order " + order.getStateName());
    }
}
