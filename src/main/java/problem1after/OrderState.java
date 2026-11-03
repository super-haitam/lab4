package problem1after;

public interface OrderState {
    void pay(Order o);
    void startPreparing(Order o);
    void deliver(Order o);
    void cancel(Order o);
    String name();
}
