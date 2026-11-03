package problem1after;

public abstract class AbstractState implements OrderState {
    private final String state;

    public AbstractState(String state) {
        this.state = state;
    }

    private void defaultMessage(String action) {
        System.out.println("Cannot " + action + " an order that is " + state);
    }

    @Override
    public void pay(Order o) {
         defaultMessage("pay");
    }

    @Override
    public void startPreparing(Order o) {
         defaultMessage("prepare");
    }

    @Override
    public void markReady(Order o) {
        defaultMessage("mark ready");
    }

    @Override
    public void deliver(Order o) {
        defaultMessage("deliver");
    }

    @Override
    public void cancel(Order o) {
        defaultMessage("cancel");
    }

    @Override
    public String name() {
        return state;
    }
}
