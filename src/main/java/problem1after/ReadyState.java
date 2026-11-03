package problem1after;

public class ReadyState extends AbstractState {
    public ReadyState() {
        super("READY");
    }

    @Override
    public void deliver(Order o) {
        o.setState(new DeliveredState());
    }
}
